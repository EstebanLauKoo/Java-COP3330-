/*
 * Karin Whiting
 * COP 3330 Object Oriented Programming
 * University of Central Florida
 */
package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 *
 * @author kwhiting
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // file error
        // Checked exception
        fileError();

        
        // divide by zero error
        // Unchecked exception
        int numerator = 12;
        int denominatorOne = 4;
        int denominatorTwo = 0;
        
        System.out.println("Divide " + numerator + " by " + denominatorOne + 
                " results in " + quotient(numerator, denominatorOne));
        
        System.out.println("Divide " + numerator + " by " + denominatorTwo + 
                " results in " + quotient(numerator, denominatorTwo));
        
        // arrayIndex
        arrayIndex();
    }
    
    public static void arrayIndex()
    {
        int num[]={1,2,3,4};
        System.out.println(num[5]);
    }
    
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }
    
    public static void fileError()
    {
        File file=new File("E://file.txt");
        FileReader fr = new FileReader(file); 
    }
    
    public static void tryCatchSyntax()
    {
        try
        {
            //Protected code
        }
        catch(ExceptionName e1)
        {
            //Catch block
        
        }
    }

    public static void tryCatchExample()
    {
        try
        {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown  :" + e);
        }
      
        System.out.println("Out of the block");
    }

    public static int multipleTryCatchExample()
    {
        FileInputStream file;
        byte x;

        try
        {
           file = new FileInputStream("E://file.txt");
           x = (byte) file.read();
        }
        catch(IOException i)
        {
           i.printStackTrace();
           return -1;
        }
        catch(FileNotFoundException f) //Not valid!
        {
           f.printStackTrace();
           return -1;
        }
        
        return 0;
    }
    
    public void deposit(double amount) throws RemoteException
    {
      // Method implementation
      throw new RemoteException();
    }
    
    public void withdraw(double amount) throws RemoteException,
                              InsufficientFundsException
    {    
       // Method implementation
    }
    
    public void tryCatchFinally()
    {
      int a[] = new int[2];
      try
      {
         System.out.println("Access element three :" + a[3]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Exception thrown  :" + e);
      }
      finally
      {
         a[0] = 6;
         System.out.println("First element value: " +a[0]);
         System.out.println("The finally statement is executed");
      }    
    }
    
    public class InsufficientFundsException extends Exception
    {
       private double amount;
    
       public InsufficientFundsException(double amount)
       {
          this.amount = amount;
       } 
       
       public double getAmount()
       {
          return amount;
       }
    }    
}

