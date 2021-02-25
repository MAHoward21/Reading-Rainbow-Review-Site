package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//Store Review objects
//Provide a way to save new reviews
//Provide a way to retrieve reviews
//Provide error handling


@Service
public class ReviewStorage {



    Map<String, Review> reviews;


    public ReviewStorage(){
        reviews = new HashMap<>();
       // Catagory sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");
        //Review sample = new Review("Where is Spot", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
          //      sampleCatagory,
            //    "This book has fun flaps to lift and lots of anilams to name with you child. would suggest this book for colors and counting also.");

       // reviews.put(sample.getReviewTitle(), sample);
    }

    public void saveReview(Review review){
        reviews.put(review.getReviewTitle(), review);
    }


    public Review getSampleByTitle(String title) {
        return reviews.get(title);
    }
//    public Collection<Review> getReviewsByCatagory(String catagory){
//        ArrayList<Review> reviews = new ArrayList<>();
//        return this.reviews
//        return reviews;
// TODO: 2/25/2021 Figure out how to search our collection by category 
//    }
}
