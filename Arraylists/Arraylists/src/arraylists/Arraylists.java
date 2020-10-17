/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Karin Whiting UCF COP 3330
 */
public class Arraylists
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // declare and instantiate an array list that only allows for
        // String objects
        ArrayList<String> cars = new ArrayList<String>();
        
        // adding to an array list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        // printing an array list
        System.out.println(cars);
        
        // array list size
        cars.size();
        
        // looping through an array list
        for (int i = 0; i < cars.size(); i++) 
        {
            System.out.println(cars.get(i));
        }    
            
        // using the for-each (ehnanced for loop)
        for (String i : cars) 
        {
            System.out.println(i);
        }
        
        // accessing an element of an array list
        String data = cars.get(0);
        
        // modifying the data of an element in an array list
        cars.set(0, "Opel");
        
        // rmeoving an element from an array list
        cars.remove(0);
        
        // rmeove all the elements of an array list
        cars.clear();

        // another example, data type must be a class (object), no primitive 
        // data types
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        
        // for-each loop
        for (int i : myNumbers) 
        {
          System.out.println(i);
        }       
        
        // sorting using the Collections.sort method
        Collections.sort(myNumbers);  // Sort cars
        for (Integer i : myNumbers) 
        {
            System.out.println(i.toString());
        }
    }
}
