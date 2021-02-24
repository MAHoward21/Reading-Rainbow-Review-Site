package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class CatagoryStorage {
    Map<String, Catagory> catogory;
//    private Catagory sampleCatagory;
//    private Review sample;

    public CatagoryStorage() {
        catogory = new HashMap<>();
//        sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");
//        Review sample = new Review("Where is Spot?", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
//                sampleCatagory,
//                "This book has fun flaps to lift and lots of anilams to name with you child. would suggest this book for colors and counting also.");
//    }
//    reviews.put(sample.getName(),sampleCatagory);

        public void saveReview(Catagory catogory){
            catogory.put(catogory.getCatagoryDescription(),catogory);
        }

        public Review getSamplebyName(String description) {
            return catogory.get(name);
        }
}
}


