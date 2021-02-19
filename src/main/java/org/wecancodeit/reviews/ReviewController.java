package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 3. Add the data to the Model objects
    // 4. Select the template to be displayed

    @RequestMapping ("/single-book-review") //1
    public String displaySigleBookReview (Model model) {
        Catagory sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");
        Review sample = new Review("Where is Spot?", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
                sampleCatagory,
                "This book has fun flaps to lift and lots of anilams to name with you child. would suggest this book for colors and counting also.");
                // 2 ^^
        model.addAttribute("review", sample); //3

        return "single-book-review"; //4
    }

}
