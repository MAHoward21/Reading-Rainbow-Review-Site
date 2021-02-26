package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;


// 1. Provide mapping for methods
// 2. Find the data for the View
// 3. Add the data to the Model objects
// 4. Select the template to be displayed

@Controller
public class BookContorller {
    private BookStorage bookStorage;


    public BookContorller(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }



}
