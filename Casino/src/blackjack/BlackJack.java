/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import casino.Player;
import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class BlackJack {
    
    private Player player;
    private boolean play;
    private Scanner scnr;
    private Deck deck;
    
    public BlackJack(Player player) {
        this.player = player;
        scnr = new Scanner(System.in);
        play = true;
        deck = new Deck();
    }
    
    private void displayRules() {
    
        System.out.println("Let's play Black Jack!");
        System.out.println("Your cash balance is " + player.getCash());
        System.out.println("Dealer must HIT if their score is 16 or less");
        System.out.println("Dealer must STAND if their score is 17 or higher");
        System.out.println("If the player wins the hand, they receive " + constants.Constants.BJ_WIN);
        System.out.println("If the dealer wins the hand, the " + constants.Constants.BJ_BET + " bet is lost");
        System.out.println("If it is a PUSH, the player keeps their " + constants.Constants.BJ_BET + " bet");
        
    }
    
    public void play() {
        
        displayRules();
        
    }
}
