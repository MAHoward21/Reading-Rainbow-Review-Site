package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatagoryControler {
    private CatagoryStorage catagoryStorage;

    // 1. Provide mapping for methods
    // 2. Find the data for the View
    // 3. Add the data to the Model objects
    // 4. Select the template to be displayed



    public CatagoryControler(CatagoryStorage catagoryStorage){


        this.catagoryStorage = catagoryStorage;
    }


    @RequestMapping("/catagory/{name}")
    public String displaySingleCatagory (@PathVariable String name, Model model) {
        Catagory sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");

        model.addAttribute("catagory", catagoryStorage.getSample(name));


        return "single-catagory";
    }
}
