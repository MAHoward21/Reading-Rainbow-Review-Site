package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
    private ReviewStorage reviewStorage;
    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 4. Select the template to be displayed


    public ReviewController(ReviewStorage reviewStorage) {


        this.reviewStorage = reviewStorage;
        // 2 ^^
    }

    @RequestMapping ("/single-book-review") //1
    // 3. Add the data to the Model objects
    public String displaySingleBookReview (Model model) {

        model.addAttribute("review", reviewStorage.getSample()); //3

        return "single-book-review"; //4
    }

}
