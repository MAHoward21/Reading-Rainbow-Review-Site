package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


// 1. Provide mapping for methods
// 2. Find the data for the View
// 3. Add the data to the Model objects
// 4. Select the template to be displayed

@Controller
@RequestMapping("/books")
public class BookController {
    private ReviewStorage reviewStorage;
    private BookStorage bookStorage;


    public BookController(ReviewStorage reviewStorage, BookStorage bookStorage) {
        this.reviewStorage = reviewStorage;
        this.bookStorage = bookStorage;
    }

    @GetMapping("/{id}")
    public String displaySingleBook(@PathVariable Long id, Model model) {
        //model.addAttribute("review", reviewStorage.getReviewById(id));
        model.addAttribute("book",  bookStorage.getBookById(id));
        return "Single book";
    }

    @PostMapping("/addReview")
    public String addReview(@RequestParam String reviewTitle, @RequestParam String reviewAuthor,
                            @RequestParam String reviewImage, @RequestParam String body, @RequestParam long bookId){
        Review reviewToAdd = new Review(reviewTitle, reviewAuthor, reviewImage, body);
        Book bookTemp = bookStorage.getBookById(bookId);
        reviewStorage.addReview(reviewToAdd);
        reviewToAdd.addBook(bookTemp);
        reviewStorage.addReview(reviewToAdd);
        return "redirect:/books/" + bookId;
    }
// TODO: 3/4/2021  change .getReviewById(id) chang the key so that we can get a list of all the reviews
}
