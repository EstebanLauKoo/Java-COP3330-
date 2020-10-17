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
public class MountainBike extends Bicycle 
{
    private String suspension;

    public MountainBike(int startCadence,
                        int startSpeed,
                        int startGear,
                        String suspensionType)
    {
        super(startCadence, startSpeed, startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension()
    {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) 
    {
        this.suspension = suspensionType;
    }

    public static void testClassMethod() {
        System.out.println("The static method in MountainBike");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in MountainBike");
    }
    
    public void printDescription() 
    {
//        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
            getSuspension() + " suspension.");
    }
}
