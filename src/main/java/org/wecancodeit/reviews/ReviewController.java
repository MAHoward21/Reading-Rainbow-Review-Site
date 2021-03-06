package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
    private ReviewStorage reviewStorage;
    private CommentStorage commentStorage;
    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 3. Add the data to the Model objects
    // 4. Select the template to be displayed


    public ReviewController(ReviewStorage reviewStorage, CommentStorage commentStorage) {
        this.commentStorage = commentStorage;
        this.reviewStorage = reviewStorage;
        // 2 ^^
    }




    @RequestMapping ("/review/{id}") //1
    public String displaySingleBookReview (@PathVariable long id, Model model) {

      model.addAttribute("review", reviewStorage.getReviewById(id)); //3

        return "single-review"; //4
    }

    @PostMapping( "/review/{id}")
    public String addComment(String commentText, String authorText, @PathVariable long id) {
        Comment commentToAdd = new Comment(commentText,authorText);
        //commentToAdd.addReview(reviewStorage.getReviewById(id));
        commentStorage.addComment(commentToAdd);
        Review tempReview = reviewStorage.getReviewById(id);
        tempReview.addComment(commentToAdd);
        reviewStorage.addReview(tempReview);



        //reviewStorage.getReviewById();
        return "redirect:/review/" + id;
    }

}
