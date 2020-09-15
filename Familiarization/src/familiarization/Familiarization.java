/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarization;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Familiarization {
    
    //declaring a member variable.
    private static Scanner scan;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instantiation
        scan = new Scanner(System.in);
       
        // sout + tab for shorthard
        // class named System a package called out and a method called println
        // this does \n after.
        System.out.println("");
        
        arithmetic();
        compoundAssign();
        unary();
        relational();
        conditional();
        instanceOf();
    }
    
    private static void arithmetic() {
        
        System.out.println("************ arithmetic *************");
    
        int numOne;
        int numTwo;
        
        System.out.println("Enter a number greater than 0:");
        
        numOne = scan.nextInt();
        
        System.out.println("Enter a number greater than 0:");
        
        numTwo = scan.nextInt();
        
  
        int plus = numOne + numTwo;
        int minus = numOne - numTwo;
        int times = numOne * numTwo;
        int divide = numOne / numTwo;
        int modulus = numOne % numTwo;
        
        System.out.println(numOne + " + " + numTwo + " = " + plus);
        System.out.println(numOne + " - " + numTwo + " = " + minus);
        System.out.println(numOne + " * " + numTwo + " = " + times);
        System.out.println(numOne + " / " + numTwo + " = " + divide);
        System.out.println(numOne + " % " + numTwo + " = " + modulus);
    }
    
    private static void compoundAssign() {
        
        System.out.println("************ compoundAssign *************");
        
        int numOne;
        int numTwo;
        int result;
        
        System.out.println("Enter a number greater than 0:");
        
        numOne = scan.nextInt();
        
        System.out.println("Enter a number greater than 0:");
        
        numTwo = scan.nextInt();
        
        result = numOne;
        
        System.out.println("result " + result);
        
        result += numTwo;
        System.out.println("result += numTwo = " + result);
        
        result -= numOne;
        System.out.println("result -= numOne = " + result);
        
        result *= numTwo;
        System.out.println("result *= numTwo = " + result);
        
        result /= numOne;
        System.out.println("result /= numOne = " + result);
        
        result %= numTwo;
        System.out.println("result %= numTwo = " + result);
    }
    
    private static void unary() {
        
        System.out.println("************ unary *************");
    
        int num;
        
        System.out.println("Enter a number greater than 0:");
        
        num = scan.nextInt();
        
        num--;
        
        System.out.println("num-- = " + num);
        
        num++;
        
        System.out.println("num++ = " + num);
        
        num = +num;
        System.out.println("+num = " + num);
        
        num = -num;
        System.out.println("-num = " + num);
        
        boolean success = true;
        
        System.out.println("success = " + success);
        
        System.out.println("!success = " + !success);
        
        
    }
    
    private static void relational() {
        
        System.out.println("************ relational *************");
    
        int numOne;
        int numTwo;
        
        System.out.println("Enter a number greater than 0:");
        numOne = scan.nextInt();
        
        System.out.println("Enter a number greater than 0:");
        numTwo = scan.nextInt();
        
        if (numOne == numTwo)
            System.out.println(numOne + " == " + numTwo);
        if (numOne != numTwo)
            System.out.println(numOne + " != " + numTwo);
        if (numOne > numTwo)
            System.out.println(numOne + " > " + numTwo);
        if (numOne >= numTwo)
            System.out.println(numOne + " >= " + numTwo);
        if (numOne < numTwo)
            System.out.println(numOne + " < " + numTwo);
        if (numOne <= numTwo)
            System.out.println(numOne + " <= " + numTwo);
        
    }
    
    private static void conditional() {
        
        System.out.println("************ conditional *************");
    
        int numOne;
        int numTwo;
        
        System.out.println("Enter a number greater than 10:");
        numOne = scan.nextInt();
        
        System.out.println("Enter a number greater than 10:");
        numTwo = scan.nextInt();
        
        if (numOne >= 10 && numTwo >= 10)
            System.out.println(numOne + "is >= 10 AND " + numTwo + " is >= 10");
        
        if (numOne >= 10 || numTwo >= 10)
            System.out.println(numOne + " OR " + numTwo + " is >= 10");
        
    }
    
    private static void instanceOf() {
        
        System.out.println("************ instanceOf *************");
    
        int num;
        
        System.out.println("Enter a number greater than 0:");
        num = scan.nextInt();
        
        // check about the instantiation
        Integer number = new Integer(num);
        
        // check about this instanceOf
        System.out.println("classNum instanceof Integer: " + (number instanceof Integer));
    }
    
}
