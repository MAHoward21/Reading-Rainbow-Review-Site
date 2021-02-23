package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;
//Store Review objects
//Provide a way to save new reviews
//Provide a way to retrieve reviews
//Provide error handling


@Service
public class ReviewStorage {


    private Catagory sampleCatagory;
    private Review sample;
    public ReviewStorage(){
        sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");
        sample = new Review("Where is Spot?", "Eric Hill", "https://target.scene7.com/is/image/Target/GUEST_5d5829f2-b8f2-4e6a-a4e2-c930457cff1d?wid=488&hei=488&fmt=pjpeg",
                sampleCatagory,
                "This book has fun flaps to lift and lots of anilams to name with you child. would suggest this book for colors and counting also.");
    }




    public Review getSample() {
        return sample;
    }
}
