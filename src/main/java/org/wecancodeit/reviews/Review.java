package org.wecancodeit.reviews;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Book book;

    @ManyToMany
    private Collection<Comment> comments = new ArrayList<>();

    @ManyToMany
    private Collection<Hashtag> hashtags = new ArrayList<>();



    private String category;
    private String reviewTitle;
    private String reviewAuthor;
    private String reviewImage;
    private String body;

    public Review(String reviewTitle, String reviewAuthor, String reviewImage, String category, String body) {
        this.reviewTitle = reviewTitle;
        this.reviewAuthor = reviewAuthor;
        this.reviewImage = reviewImage;
        this.category = category;
        this.body = body;
    }

    protected Review(){}

    public Book getBook() {
        return book;
    }

    public void addBook(Book book) {
        this.book = book;
    }

    public long getId() {
        return id;
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

        public String getCategory () {
        return category;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", category=" + category +
                ", reviewTitle='" + reviewTitle + '\'' +
                ", reviewAuthor='" + reviewAuthor + '\'' +
                ", reviewImage='" + reviewImage + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public void addComment(Comment commentToAdd){
        comments.add(commentToAdd);
    }
    public Collection<Comment> getComments() {
        return comments;
    }

}