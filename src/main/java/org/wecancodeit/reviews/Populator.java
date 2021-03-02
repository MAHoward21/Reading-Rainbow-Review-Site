package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {

    private ReviewStorage reviewStorage;
    private CategoryStorage categoryStorage;


    public Populator(ReviewStorage reviewStorage, CategoryStorage categoryStorage){

        this.reviewStorage = reviewStorage;
        this.categoryStorage = categoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {

    Book harryPotter = new Book( );
    Review harryPotterReview = new Review("This book is Good", "Jim Bob", "#", "kidsBooks", "This book is so good i laughed");
    harryPotter.addReview(harryPotterReview);

    Category kidsBooks   = new Category("kidsBooks", "It's books about kid stuff.");
    Review kidsBooksReview = new Review("Where is Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
            "kidsBooks",  "This book has fun flaps to lift and lots of animals to name with you child. would suggest this book for colors and counting also.");
        // TODO: 3/2/2021 impliment repository data for book and category
    reviewStorage.saveReview(kidsBooksReview);
//        System.out.println(reviewStorage.reviews);
    }
}
