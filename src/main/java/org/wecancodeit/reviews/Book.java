package org.wecancodeit.reviews;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Book {




    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "book")
    private Collection<Review> reviews = new ArrayList<Review>();

    @ManyToMany(mappedBy = "books")
    private Collection<Category> genres = new ArrayList<Category>();

    private String bookTitle;
    private String bookAuthor;
    private String coverArt;


    protected Book(){}

    public Book(String title, String author, String cover) {
        bookTitle = title;
        bookAuthor = author;
        coverArt = cover;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviews) {
        this.reviews = reviews;
    }




    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getCoverArt() {
        return coverArt;
    }
    public long getId() { return id; }

    public void addReview(Review reviewToAdd) {
        reviews.add(reviewToAdd);
    }

    public Collection<Category> getGenres() {
        return genres;
    }

    public void setGenres(Collection<Category> genres) {
        this.genres = genres;
    }
}
