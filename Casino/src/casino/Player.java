/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Player {
    /** Member variables*/
    private String name;
    private int cash;
    private Scanner scnr;
    
    // new player function 
    public Player() {
        scnr = new Scanner(System.in);
        int money;
        String playerName;
        
        // searches for input values from user
        System.out.println("Enter name:");
        playerName = scnr.next();
        
        System.out.println("How much money did you start with?(Minimum of $10 to play)");
        money = scnr.nextInt();
        
        // sets the name and the cash for the player.
        setName(playerName);
        setCash(money);
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(int cash) {
        this.cash = cash;
    }

}
