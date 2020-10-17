/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsets;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Karin Whiting UCF COP 3330
 */
public class Hashsets
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Declare and instantiate a hash set
        HashSet<String> cars = new HashSet<String>();
        
        // add elements to the hash set
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        
        // display the hash set
        System.out.println(cars);

        // check if an item exists
        cars.contains("Mazda");
        
        // remove an item
        cars.remove("Volvo");
        
        // remove all items
        cars.clear();
        
        // hash set size
        cars.size();
        
        // looping through hash set
        for (String i : cars) 
        {
            System.out.println(i);
        }
    
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) 
        {
            if(numbers.contains(i)) 
            {
                System.out.println(i + " was found in the set.");
            } 
            else 
            {
                System.out.println(i + " was not found in the set.");
            }
        }
        
        // using an Iterator to loop through a collection
        Iterator<Integer> it = numbers.iterator();
        
        while(it.hasNext()) 
        {
            Integer i = it.next();
            if(i < 10) 
            {
                it.remove();
            }
        }
        
        System.out.println(numbers);        
    }  
}
