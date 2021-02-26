package org.wecancodeit.reviews;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {


    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "book")
    private Collection<Review> reviews;

    @ManyToMany(mappedBy = "book")
    private Collection<Category> genres;

    private String bookTitle;
    private String bookAuthor;
    private String coverArt;


    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviews) {
        this.reviews = reviews;
    }

    protected Book(){}



}
