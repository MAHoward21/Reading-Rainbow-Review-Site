package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatagoryControler {
    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 3. Add the data to the Model objects
    // 4. Select the template to be displayed
    @RequestMapping("/single-catagory")
    public String displaySingleCatagory (Model model) {
        Catagory sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");
        model.addAttribute("catagory", sampleCatagory);


        return "single-catagory";
    }
}
