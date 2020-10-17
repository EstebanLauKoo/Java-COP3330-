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
public class RoadBike extends Bicycle implements IBicycle
{
// In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence,
                    int startSpeed,
                    int startGear,
                    int newTireWidth)
    {
        super(startCadence,
              startSpeed,
              startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
      return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

//    public static void testClassMethod() {
//        System.out.println("The static method in RoadBike");
//    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in RoadBike");
    }
    
    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
            " MM tires.");
    }    
    
    @Override
    public String identifyMyself() 
    {
        return "I am a Road Bike.";
    }
}
