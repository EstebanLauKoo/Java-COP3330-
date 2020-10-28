/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import blackjack.Card;
import java.util.Scanner;
import constants.Constants;
import java.util.ArrayList;
import java.util.Scanner;
import constants.Constants.Face;


/**
 *
 * @author esteb
 */
public class Player implements IPlayer {
    /** Member variables*/
    private String name;
    private int cash;
    private int score;
    private Scanner scnr;
    private ArrayList<Card> hand;
    private boolean busted;
    private boolean play;
    
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
    
    public boolean playAgain() {
    
        int choice;
        
        System.out.println("Player, play another hand? (0 = No, 1 = Yes)");
        choice = scnr.nextInt();
        
        if (choice == Constants.HIT)
            return true; 
        else
            return false;        
    }
    
    public int hitOrStand() {
    
        int choice;
        
        System.out.println("player, another card? (0 = STAND, 1 = HIT)" );
        choice = scnr.nextInt();
        

        
        if (choice == Constants.HIT)
            return Constants.HIT; 
        else
            return Constants.STAND;
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

    /**
     * @return the score
     */
    public int getScore() {
        score = 0;
        
        for(Card c : hand) {
        
            score += c.getValue(); 
        }
        
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the hand
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    /**
     * @return the busted
     */
    public boolean isBusted() {
        return busted;
    }

    /**
     * @param busted the busted to set
     */
    public void setBusted(boolean busted) {
        this.busted = busted;
    }

    /**
     * @return the play
     */
    public boolean isPlay() {
        return play;
    }

    /**
     * @param play the play to set
     */
    public void setPlay(boolean play) {
        this.play = play;
    }
    
}
