package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


// 1. Provide mapping for methods
// 2. Find the data for the View
// 3. Add the data to the Model objects
// 4. Select the template to be displayed

@Controller
public class BookController {
    private ReviewStorage reviewStorage;
    private BookStorage bookStorage;


    public BookController(ReviewStorage reviewStorage) {
        this.reviewStorage = reviewStorage;
    }

    @RequestMapping("/books/{id}")
    public String displaySingleBook(@PathVariable Long id, Model model) {
        model.addAttribute("review", reviewStorage.getReviewById(id));
        model.addAttribute("book",  bookStorage.getBookById(id);
        return "Single book";
    }
// TODO: 3/4/2021  change .getReviewById(id) chang the key so that we can get a list of all the reviews
}
