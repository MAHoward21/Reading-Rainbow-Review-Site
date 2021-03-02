package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Consumer;
//Store Review objects
//Provide a way to save new reviews
//Provide a way to retrieve reviews
//Provide error handling


@Service
public class ReviewStorage {

    private ReviewRepository reviews;

    public ReviewStorage(ReviewRepository reviews){
        this.reviews = reviews;
      
    }

    public void saveReview(Review review) { reviews.save(review);}

//    public Review getReviewByTitle(String title) {
//        return reviews.get(title);
//    }

    public Collection<Review> getReviewsByCategory(String category){
        ArrayList<Review> foundReviews = new ArrayList<>();
        Optional<Review> tempReviewOptional;
        Review tempReview = new Review();
        for (long i=0; i == reviews.count(); i++) {
            tempReviewOptional = reviews.findById(i);
            tempReviewOptional.ifPresent((Consumer<? super Review>) (tempReview = tempReviewOptional.get()));

            if (tempReview.getCategory() == category){
                    foundReviews.add(tempReview);
            }
        }
        return foundReviews;
//// TODO: 2/25/2021 Figure out how to search our collection by category
    }
}
