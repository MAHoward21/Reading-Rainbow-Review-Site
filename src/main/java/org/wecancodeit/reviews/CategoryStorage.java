package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {
    private Category sampleCategory;
    private Review sample;

    Map<String, Category> categories;

    public CategoryStorage() {
        categories = new HashMap<>();

        Category sampleCategory = new Category("Kids books", "The books you read to kids who cant talk");

        categories.put(sampleCategory.getName(), sampleCategory);
    }

    public void saveCategory(Category category){
        categories.put(category.getName(), category);
    }



    public Category getSample(String name) {
        return categories.get(name);
    }
}


