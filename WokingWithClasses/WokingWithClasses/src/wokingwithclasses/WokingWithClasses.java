/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wokingwithclasses;

import backend.Instructor;
import backend.Student;
import javax.swing.JOptionPane;


/**
 *
 * @author kwhiting
 */
public class WokingWithClasses
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Student s = new Student();
        // not a staic method, cannot access directly through class name
//        Student.setFName("Test");
        
        s.setfName("Karin");
        s.setlName("Whiting");
        s.getDob().setDay(3);
        s.getDob().setMonth(8);
        s.getDob().setYear(1971);
        s.setFlResident(true);
        s.apply();
        
        System.out.println("Student: " + s.getfName() + " acceptance is " + s.isAccepted());
//        Instructor i = new Instructor();
        System.out.println(Instructor.NAME);
        
        ExampleProtected ex = new ExampleProtected();
        ex.showProtected();
        
        // static methods allow for direct access without instantiating the class
        JOptionPane.showMessageDialog(null, "Static method call");
        // cannot call a non static method from a static method
//        nonStatic();


        staticMethod();
    }
    
    private void nonStatic()
    {
        System.out.println("non static method");
    }

    private static void staticMethod()
    {
        System.out.println(" static method");
    }
}
