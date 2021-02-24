package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {

    private ReviewStorage reviewStorage;

    public Populator(ReviewStorage reviewStorage){

        this.reviewStorage = reviewStorage;
    }

    @Override
    public void run(String... args) throws Exception {
    Catagory kidsBooks   = new Catagory("The Kids Books", "It's books about kid stuff.");
    Review kidsBooksReview = new Review("Where is Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
            kidsBooks,  "This book has fun flaps to lift and lots of anilams to name with you child. would suggest this book for colors and counting also.");

    reviewStorage.saveReview(kidsBooksReview);
        System.out.println(reviewStorage.reviews);
    }
}
