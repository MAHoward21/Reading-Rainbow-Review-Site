package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {

    private ReviewStorage reviewStorage;
    private CategoryStorage categoryStorage;
    private BookStorage bookStorage;


    public Populator(ReviewStorage reviewStorage, CategoryStorage categoryStorage, BookStorage bookStorage){

        this.reviewStorage = reviewStorage;
        this.categoryStorage = categoryStorage;
        this.bookStorage = bookStorage;
    }

    @Override
    public void run(String... args) throws Exception {

    Book harryPotter = new Book("Harry Potter", "JKR", "#");
    bookStorage.addBook(harryPotter);

    Book wheresSpot = new Book("Where's Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg");
    bookStorage.addBook(wheresSpot);

    Review harryPotterReview = new Review("This book is Good", "Jim Bob", "#", "kidsBooks", "This book is so good i laughed");
    reviewStorage.addReview(harryPotterReview);

    harryPotter.addReview(harryPotterReview);

    Category kidsBooks   = new Category("kidsBooks", "It's books about kid stuff.");
    categoryStorage.addCategory(kidsBooks);

    Category fantasy = new Category("Fantasy", "Books with magic and unicorns.");
    categoryStorage.addCategory(fantasy);



    Review kidsBooksReview = new Review("Where is Spot Really?", "Tony Stark", "#",
            "kidsBooks",  "This book has fun flaps to lift and lots of animals to name with you child. would suggest this book for colors and counting also.");
        // TODO: 3/2/2021 impliment repository data for book and category
    reviewStorage.addReview(kidsBooksReview);

//        System.out.println(reviewStorage.reviews);
    }
}
