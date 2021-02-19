package org.wecancodeit.reviews;

public class Review {

    private String reviewTitle;
    private String reviewAuthor;
    private String reviewImage;
    private String body;
    private Catagory catagory;



    public Review(String reviewTitle, String reviewAuthor, String reviewImage, Catagory catagory, String body) {
        this.reviewTitle = reviewTitle;
        this.reviewAuthor = reviewAuthor;
        this.reviewImage = reviewImage;
        this.catagory = catagory;
        this.body = body;
    }

        public String getReviewTitle () {
        return reviewTitle;
    }

        public String getReviewAuthor () {
        return reviewAuthor;
    }

        public String getReviewImage () {
        return reviewImage;
    }

        public Catagory getCatagory () {
        return catagory;
    }

    public String getBody() {
        return body;
    }
}
