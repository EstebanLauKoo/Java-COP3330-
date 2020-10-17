/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

import org.omg.CORBA.Environment;
/**
 *
 * @author kwhiting
 */
public class Bicycle {

    /**
     * @return the counter
     */
    public static int getCounter() {
        return numberOfBicycles;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(int aCounter) {
        numberOfBicycles = aCounter;
    }
    // fields, member variables
    private int cadence = 0;
    private int speed = 0;
    private int gear = 6;
    private String name;
    private int id;
    
    private static int numberOfBicycles = 0;
    private static final int MINIMUM_GEARS = 3; 
            
    public Bicycle() 
    {
        this(0, 0, 0);
        
    }
    
    // parameters
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        // local variable
        int count = 0;
        cadence = startCadence;
        speed = startSpeed;
        numberOfBicycles++;
    }
    
    public int getID() 
    {
        return id;
    }
    
    protected void changeCadence(int newValue) {
         setCadence(newValue);
    }

    void changeGear(int newValue) {
         setGear(newValue);
    }



    void speedUp(int increment) {
         setSpeed(getSpeed() + increment);
         return;
    }

    void applyBrakes(int decrement) {
        if(decrement == 0)
            return;
        else
            setSpeed(getSpeed() - decrement);
    }

    /**
     * @return the cadence
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * @param cadence the cadence to set
     */
    public void setCadence(int inCadence) {
        cadence = inCadence;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the gear
     */
    public int getGear() {
        return gear;
    }

    /**
     * @param gear the gear to set
     */
    public void setGear(int gear) {
        this.gear = gear;
    }

    public Bicycle seeWhosFastest(Bicycle myBike, Bicycle yourBike, Environment env) 
    {
        Bicycle fastest = new Bicycle();
        
        // code to calculate which bike is 
        // faster, given each bike's gear 
        // and cadence and given the 
        // environment (terrain and wind)
//        return fastest;
        return fastest;
    }
    public void printDescription()
    {
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");  
    }
    
    public static void testClassMethod() 
    {
        System.out.println("The static method in Bicycle");
    }
    
    public void testInstanceMethod() 
    {
        System.out.println("The instance method in Bicycle");
    }
}
