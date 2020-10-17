/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author kwhiting
 */
public class Polymorphism 
{
    public static void main(String[] args)
    {
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);
        
        bike03.setCadence(45);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();

        RoadBike roadBike = new RoadBike(40, 20, 8, 23);
        System.out.println(roadBike.identifyMyself());
        
        Bicycle bike04 = roadBike;
        
        Bicycle.testClassMethod();
        RoadBike.testClassMethod();
        bike04.testInstanceMethod();
    }    
}
