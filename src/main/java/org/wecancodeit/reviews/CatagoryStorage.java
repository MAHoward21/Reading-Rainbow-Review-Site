package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CatagoryStorage {
    private Category sampleCategory;
    private Review sample;

    Map<String, Category> catagories;

    public CatagoryStorage() {
        catagories = new HashMap<>();

        Category sampleCategory = new Category("Kids books", "The books you read to kids who cant talk");

        catagories.put(sampleCategory.getName(), sampleCategory);
    }

    public void saveCatagory(Category category){
        catagories.put(category.getName(), category);
    }



    public Category getSample(String name) {
        return catagories.get(name);
    }
}


