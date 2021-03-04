package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Category {


    @Id
    @GeneratedValue
    private long id;

    @ManyToMany
    private Collection<Book> books = new ArrayList<Book>();

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    private String name;
    private String description;
//    Collection<Review> reviews;

    protected Category(){};

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
//        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    public Collection<Review> getReviews() {
//        return reviews;
//    }
}
