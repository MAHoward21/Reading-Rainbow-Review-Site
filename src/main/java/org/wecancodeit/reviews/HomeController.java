package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private CategoryStorage categoryStorage;

    public HomeController(CategoryStorage categoryStorage) {

        this.categoryStorage = categoryStorage;
    }


    @RequestMapping ("/")
    public String displayHomePage (Model model) {
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "Home-Template";
    }
}



