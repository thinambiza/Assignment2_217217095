package za.ac.cput;

import org.junit.jupiter.api.Test;

/*
 * @Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 16 May 2020
 * This class is the Map Collection Class.
 */

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    Map <String, String> dogBreed = new HashMap<>();

    @Test
    void MapAdd(){

        dogBreed.put("key 1", "Chihuahua");
        dogBreed.put("key 2", "Bichon Frise");
        dogBreed.put("key 3", "American Foxhound");

        System.out.println("Dog breeds added are: " + dogBreed);
    }

    @Test
    void MapRemove(){

        dogBreed.put("key 1", "Chihuahua");
        dogBreed.put("key 2", "Bichon Frise");
        dogBreed.put("key 3", "American Foxhound");
        System.out.println("Before removing a dog breed: " + dogBreed);

        dogBreed.remove("key 3", "American Foxhound");

        System.out.println("After removing a dog bread: " + dogBreed);
    }

    @Test
    void MapFind(){
        dogBreed.put("key 1", "Chihuahua");
        dogBreed.put("key 2", "Bichon Frise");
        dogBreed.put("key 3", "American Foxhound");

        System.out.println("Dog breeds are: " + dogBreed);

        String Chihuahua = dogBreed.get("key 1");

        System.out.println("The dog breed contains " + Chihuahua + " " + Chihuahua.contains(Chihuahua));
    }


}
