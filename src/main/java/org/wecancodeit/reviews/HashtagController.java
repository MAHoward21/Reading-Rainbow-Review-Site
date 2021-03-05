package org.wecancodeit.reviews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HashtagController {
    private HashtagStorage hashtagStorage;
    public HashtagController(HashtagStorage hashtagStorage) {
        this.hashtagStorage = hashtagStorage;
    }
    @RequestMapping("/hashtags/{id}")
    public String displaySingleHashtagPage(@PathVariable Long id, Model model) {
        model.addAttribute("hashtags", hashtagStorage.getHashtagById(id));
        return "hashtag-template"; //TODo make a single hashtag page
    }
    @RequestMapping("/hashtags")
    public String displayAllHashtagPage(Model model) {
        model.addAttribute("hashtags", hashtagStorage.getAllHashtags());
        return "hashtag-template";
    }


    @PostMapping("/hashtags")
    public String addHashtag(@RequestParam String hashtagName) {
        if (!hashtagName.startsWith("#")) {
            hashtagName = "#" + hashtagName;
        }
        Hashtag hashtagToAdd = new Hashtag(hashtagName);
        hashtagStorage.addHashtag(hashtagToAdd);
        return "redirect:/hashtags";
    }
}