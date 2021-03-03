package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CategoryStorage {
    private CategoryRepository categories;




    public CategoryStorage(CategoryRepository categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.save(category);

    }

    public Iterable<Category> getAllCategories() {
        return categories.findAll();
    }

    public Category getCategoryById(Long id) {
        Optional<Category> retrievedCategoryLinks = categories.findById(id);
        if(retrievedCategoryLinks.isPresent()){
            Category foundCategory = retrievedCategoryLinks.get();
            return foundCategory;
        }
return null;
    }
}


