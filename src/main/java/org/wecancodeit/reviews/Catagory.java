package org.wecancodeit.reviews;

import java.util.ArrayList;
import java.util.Collection;

public class Catagory {
    private String name;
    private String description;
    Collection<Review> reviews;

    public Catagory(String name, String description) {
        this.name = name;
        this.description = description;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
