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


        Category fantasy = new Category("fantasy", "Books with magic and unicorns.");
        Category kidsBooks = new Category("kidsbooks", "It's books about kid stuf.");
        Category mystery = new Category("mystery", "Books about some type of crime");
        Category poetry = new Category("poetry","Books about poetry");
        categoryStorage.addCategory(fantasy);
        categoryStorage.addCategory(kidsBooks);
        categoryStorage.addCategory(mystery);
        categoryStorage.addCategory(poetry);

        Book harryPotter = new Book("Harry Potter", "JKR", "#");
        bookStorage.addBook(harryPotter);
        Book wheresSpot = new Book("Where's Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg");
        bookStorage.addBook(wheresSpot);
        Book nancyDrew = new Book("Nancy Drew", "Carolyn Keene", "#");
        bookStorage.addBook(nancyDrew);
        Book whereTheSidewalkEnds = new Book("Where The Sidewalk Ends","Shel silverstein", "#");
        bookStorage.addBook(whereTheSidewalkEnds);

        Review harryPotterReview = new Review("This book is Good", "Jim Bob", "#", "fantasy", "This book is so good I laughed");
        reviewStorage.addReview(harryPotterReview);
        harryPotter.addReview(harryPotterReview);
        Review wheresSpotReview = new Review("Kids will like reading this book", "Jane Lee", "#", "kidsBooks", "amazing book");
        reviewStorage.addReview(wheresSpotReview);
        wheresSpot.addReview(wheresSpotReview);
        Review nancyDrewReview = new Review("This book is great!", "Lee Bob", "#", "mystery", "My head still spinning from reading this book");
        reviewStorage.addReview(nancyDrewReview);
        nancyDrew.addReview(nancyDrewReview);
        Review whereTheSideWalkEnds = new Review("such a pleasure to read this book!", "Jonny Bob", "#", "poetry", "Interesting book");
        reviewStorage.addReview(whereTheSideWalkEnds);
        whereTheSidewalkEnds.addReview(whereTheSideWalkEnds);



    Review kidsBooksReview = new Review("Where is Spot Really?", "Tony Stark", "#",
            "kidsBooks",  "This book has fun flaps to lift and lots of animals to name with you child. would suggest this book for colors and counting also.");
        // TODO: 3/2/2021 impliment repository data for book and category
    reviewStorage.addReview(kidsBooksReview);

//        System.out.println(reviewStorage.reviews);
    }
}
