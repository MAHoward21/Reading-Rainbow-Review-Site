package org.wecancodeit.reviews;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private long id;
    private String comment;

    private String author;
    @ManyToMany (mappedBy = "comments")
    private Collection<Review> reviews = new ArrayList<>();
    protected Comment() {
    }
    public Comment( String comment, String author) {
        this.author = author;
        this.comment = comment;
    }
    public long getId() {
        return id;
    }
    public String getComment() {
        return comment;
    }
    public String getAuthor() {
        return author;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review reviewToAdd) {
        reviews.add(reviewToAdd);
    }

}
