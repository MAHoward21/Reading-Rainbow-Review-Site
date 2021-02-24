package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CatagoryStorage {
    private Catagory sampleCatagory;
    private Review sample;

    Map<String, Catagory> catagories;

    public CatagoryStorage() {
        catagories = new HashMap<>();

        Catagory sampleCatagory = new Catagory("Kids books", "The books you read to kids who cant talk");

        catagories.put(sampleCatagory.getName(), sampleCatagory);
    }

    public void saveCatagory(Catagory catagory){
        catagories.put(catagory.getName(), catagory);
    }



    public Catagory getSample(String name) {
        return catagories.get(name);
    }
}


