package org.wecancodeit.reviews;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany (mappedBy = "hashtags")
    private Collection<Review> reviews;

    protected Hashtag() {
    }
    public Hashtag(String name, Review...reviews) {
        this.name = name;
        this.reviews= List.of(reviews);
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review reviewToAdd) {
        reviews.add(reviewToAdd);
    }
}