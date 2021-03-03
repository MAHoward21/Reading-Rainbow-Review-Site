package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {
    private CategoryRepository categories;




    public CategoryStorage(CategoryRepository categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.save(category);
    }
}


