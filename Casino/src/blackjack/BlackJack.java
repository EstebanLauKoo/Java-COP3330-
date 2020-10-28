/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import casino.Player;
import java.util.Scanner;
import constants.Constants;
import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class BlackJack {
    
    private Player player;
    private boolean play;
    private Scanner scnr;
    private Deck deck;
    private Dealer dealer;
    private Card card;
    
    public BlackJack(Player player) {
        this.player = player;
        scnr = new Scanner(System.in);
        play = true;
        deck = new Deck();
        dealer = new Dealer();
        card = new Card();
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
    
    public void results() {
    
        System.out.println("Player's Score " + player.getScore());        
        System.out.println("Dealer's Score " + dealer.getScore());
        
            if(dealer.getScore() > Constants.BUST) {
                System.out.println("Dealer Busted! Player wins $" + Constants.BJ_BET);
                player.setCash(player.getCash() + Constants.BJ_BET);
            }
            
            else if (dealer.getScore() == player.getScore()) {
            
                System.out.println("It was a PUSH! player wins $" + Constants.BJ_BET);
                player.setCash(player.getCash() + Constants.BJ_BET);
                
            }
            
            else if (player.getScore() > dealer.getScore()) {
            
                System.out.println("Player WINS the hand! Player wins $" + Constants.BJ_WIN);
                player.setCash(player.getCash() + Constants.BJ_BET);
                
            }
            
            else {
            
                System.out.println("Dealer WINS the hand");
                
            }
    }
    
    public void play() {
        
        displayRules(); 
        
        if (player.getCash() < Constants.BJ_BET) {
        
            System.out.println("You are out of cash, you cannot play");
            play = false;
            
        }
        
        while(play) {
        
            System.out.println("Player's cash $" + player.getCash());
            
            if (player.getCash() < Constants.BJ_BET) {
            
                System.out.println("You are out of cash, you cannot play");
                play = false;
                break;
                
            }
            
            player.setCash(player.getCash() - Constants.BJ_BET);
            
            System.out.println("Dealing...");
            
            player.setHand(new ArrayList());
            player.setScore(Constants.ZERO);
            player.setBusted(false);
            dealer.setHand(new ArrayList());
            dealer.setScore(Constants.ZERO);
            
            
            for(int c = 0; c < 2; c++) {
            
                card = dealer.deal(deck);
                player.getHand().add(card);
            
            } 

            for(int c = 0; c < 2; c++) {
            
                card = dealer.deal(deck);
                dealer.getHand().add(card);
            
            } 
            
            System.out.println("Player's Score " + player.getScore());
                       
            while (player.hitOrStand() == 1) {
            
                card = dealer.deal(deck);
                player.getHand().add(card);
                System.out.println("Player's Score " + player.getScore());
                
                if (player.getScore() > Constants.BUST) {
                
                    System.out.println("Player Busted! You lost the hand");
                    player.setBusted(true);
                    break;
                    
                }
                
            }
            
            if (player.isBusted() == true ) {
            
                play = player.playAgain();
                
                
            }
            
            else {
            
                System.out.println("Dealer's Score " + dealer.getScore());
                
                while (dealer.hitOrStand() == 1) {
                    
                    card = dealer.deal(deck);
                    dealer.getHand().add(card);
                                   
                    System.out.println("Dealer's Score " + dealer.getScore());

                    if (dealer.getScore() > Constants.BUST) {

                        System.out.println("Dealer Busted!");
                        player.setBusted(true);
                        break;

                    }                    
                }
                
                            results();
                            
                            play = player.playAgain();
            }
                                  
        }
        
    }
}
