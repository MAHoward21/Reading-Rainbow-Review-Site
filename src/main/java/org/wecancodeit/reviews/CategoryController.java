package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {



    private CategoryStorage categoryStorage;

    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 3. Add the data to the Model objects
    // 4. Select the template to be displayed


    public CategoryController(CategoryStorage categoryStorage) {


        this.categoryStorage = categoryStorage;
    }


    @RequestMapping("/category/{name}")
    public String displaySingleCategory(@PathVariable String name, Model model) {
        Category sampleCategory = new Category("Kids books", "The books you read to kids who cant talk");

        model.addAttribute("category", categoryStorage.getSample(name));


        return "single-category";
    }
}
