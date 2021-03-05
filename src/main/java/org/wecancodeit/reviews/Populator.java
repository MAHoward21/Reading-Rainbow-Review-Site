package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {

    private ReviewStorage reviewStorage;
    private CategoryStorage categoryStorage;
    private BookStorage bookStorage;
    private CommentStorage commentStorage;


    public Populator(ReviewStorage reviewStorage, CategoryStorage categoryStorage, BookStorage bookStorage, CommentStorage commentStorage){

        this.reviewStorage = reviewStorage;
        this.categoryStorage = categoryStorage;
        this.bookStorage = bookStorage;
        this.commentStorage = commentStorage;
    }

    @Override
    public void run(String... args) throws Exception {


        Category fantasy = new Category("Fantasy", "Books with magic and unicorns.");
        Category kidsBooks = new Category("kidsbooks", "It's books about kid stuf.");
        Category mystery = new Category("mystery", "Books about some type of crime");
        Category poetry = new Category("poetry","Books about poetry");



        Book harryPotter = new Book("Harry Potter", "JKR", "#");
        harryPotter.getGenres().add(kidsBooks);
        harryPotter.getGenres().add(fantasy);
        bookStorage.addBook(harryPotter);
        kidsBooks.getBooks().add(harryPotter);
        fantasy.getBooks().add(harryPotter);

        Book wheresSpot = new Book("Where's Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg");
        wheresSpot.getGenres().add(kidsBooks);
        bookStorage.addBook(wheresSpot);
        kidsBooks.getBooks().add(wheresSpot);

        Book nancyDrew = new Book("Nancy Drew", "Carolyn Keene", "#");
        nancyDrew.getGenres().add(kidsBooks);
        nancyDrew.getGenres().add(mystery);
        bookStorage.addBook(nancyDrew);
        mystery.getBooks().add(nancyDrew);
        kidsBooks.getBooks().add(nancyDrew);

        Book whereTheSidewalkEnds = new Book("Where The Sidewalk Ends","Shel silverstein", "#");
        whereTheSidewalkEnds.getGenres().add(poetry);
        whereTheSidewalkEnds.getGenres().add(kidsBooks);
        bookStorage.addBook(whereTheSidewalkEnds);
        poetry.getBooks().add(whereTheSidewalkEnds);
        kidsBooks.getBooks().add(whereTheSidewalkEnds);

        categoryStorage.addCategory(fantasy);
        categoryStorage.addCategory(kidsBooks);
        categoryStorage.addCategory(mystery);
        categoryStorage.addCategory(poetry);

        Comment rudeCommentOnNancyDrew = new Comment( "Nancy has a dumb name! ;P", "HaXOR89");
//        Comment rudeCommentOnHarryPotter = new Comment( "Harry Porter has a dumb name! ;P", "HaXOR89");
//        Comment rudeCommentOnWheresSpot = new Comment( "Spot has a dumb name! ;P", "HaXOR89");
//        Comment rudeCommentOnSidewalk = new Comment( "Shell has a dumb name! ;P", "HaXOR89");

        commentStorage.addComment(rudeCommentOnNancyDrew);
//        commentStorage.addComment(rudeCommentOnHarryPotter);
//        commentStorage.addComment(rudeCommentOnWheresSpot);
//        commentStorage.addComment(rudeCommentOnSidewalk);

        Review harryPotterReview = new Review("This book is Good", "Jim Bob", "#", "fantasy", "This book is so good I laughed");
        harryPotterReview.addBook(harryPotter);
//        harryPotterReview.addComment(rudeCommentOnHarryPotter);
        reviewStorage.addReview(harryPotterReview);
        harryPotter.addReview(harryPotterReview);

        Review wheresSpotReview = new Review("Kids will like reading this book", "Jane Lee", "#", "kidsBooks", "Another challenge to translate the magnificence of Shaun Tan’s book Dog. Throughout history and perhaps beyond, the deep and lasting friendship between Man and dogs has been documented for its authentic and unchanging relationship.");
        wheresSpotReview.addBook(wheresSpot);
        //wheresSpotReview.addComment(rudeCommentOnWheresSpot);
        reviewStorage.addReview(wheresSpotReview);
        wheresSpot.addReview(wheresSpotReview);

        Review nancyDrewReview = new Review("This book is great!", "Lee Bob", "#", "mystery", "My head still spinning from reading this book");
        nancyDrewReview.addBook(nancyDrew);
        nancyDrewReview.addComment(rudeCommentOnNancyDrew);
//        reviewStorage.addReview(nancyDrewReview);
        nancyDrew.addReview(nancyDrewReview);

        Review whereTheSideWalkEndsReview = new Review("such a pleasure to read this book!", "Jonny Bob", "#", "poetry", "Interesting book");
        whereTheSideWalkEndsReview.addBook(whereTheSidewalkEnds);
        //whereTheSideWalkEndsReview.addComment(rudeCommentOnSidewalk);
        reviewStorage.addReview(whereTheSideWalkEndsReview);
        whereTheSidewalkEnds.addReview(whereTheSideWalkEndsReview);




    Review kidsBooksReview = new Review("Where is Spot Really?", "Tony Stark", "#",
            "kidsBooks",  "This book has fun flaps to lift and lots of animals to name with you child. would suggest this book for colors and counting also.");
    kidsBooksReview.addBook(wheresSpot);
    reviewStorage.addReview(kidsBooksReview);
    wheresSpot.addReview(kidsBooksReview);

//        System.out.println(reviewStorage.reviews);
    }
}
