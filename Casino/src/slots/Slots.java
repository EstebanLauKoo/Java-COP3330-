/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slots;

import casino.Player;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author esteb
 */
public class Slots {
    
    // all our private members
    private static final int SLOTS = 3;
    
    private Random rands;
    private char[] spins;
    private boolean play;
    private Player player;
    private Scanner scnr;
    
    // the array of characters
    private static final char[] SYMBOLS = {'!', '@', '#', '$', '%', '&'};
    
    
    public Slots(Player player) {
        
        this.player = player;
        scnr = new Scanner(System.in);
        rands = new Random();
        spins = new char[3];
        play = true;
        
    
    }
    
    // slots functionality
    public void play(){
        

        // initial print out with instructions
        System.out.println("Let's play the slot machines!");
        System.out.println("Your cash balance is " + player.getCash());
        System.out.println("The bet is " + constants.Constants.BET);
        System.out.println("Match two symbols to win " + constants.Constants.PAIR_PAYOUT);
        System.out.println("Match all three symbols to win " + constants.Constants.TRIPLE_PAYOUT);
        
        // runs if play is true
        while(play) {
         
            int input;
            int s;
            
            // sets cash value - the bet
            player.setCash(player.getCash() - constants.Constants.BET);
            
            // prints out the symbols
            System.out.println("Spinning....");
            
            for(s = 0; s < spins.length; s++ ) {
                spins[s] = randomSymbol();
                System.out.print(spins[s] + " ");
            }
            
            System.out.println("");
            
            // compares the symbols in the array to see the win condition                  
            if( spins[0] == spins[1] && spins[1] == spins[2] ) {
                
                System.out.println("Three symbols matched, you won " + constants.Constants.TRIPLE_PAYOUT + "!");
                player.setCash(player.getCash() + constants.Constants.TRIPLE_PAYOUT);
                System.out.println("CASH - " + player.getCash());                

            }
                    
            else if (spins[0] == spins[1] || spins[1] == spins[2] || spins[2] == spins[0] ) {
                System.out.println("Two symbols matched, you won " + constants.Constants.PAIR_PAYOUT + "!");
                player.setCash(player.getCash() + constants.Constants.PAIR_PAYOUT);
                System.out.println("CASH - " + player.getCash());
            }
            
            else {
                System.out.println("No symbols matched");
                System.out.println("CASH - " + player.getCash());                
            }
            
            // checks if player has money to play if not it breaks out and sets play to false
            if(player.getCash() < 5) {
                System.out.println("You don't have enough money to play");
                play = false;
                break;
            }   
            
            // ask player if they want to play again if they have enough cash. if they pick 0 then they exi. checks for other user input.
            else {
                System.out.println("Would you like to spin again? (YES = 1, NO = 0)");
                input = scnr.nextInt();
                
                if (input == 1) {
                    play = true;                    
                }
                
                else if ( input == 0) { 
                    play = false;
                    break;
                }
                
                else {
                    System.out.println("Sorry incorrect user input");
                    play = false;
                    break;
                }
                
            }
            
             
        }
        
        // prints out the users total after quitting
        System.out.println("Thank you for playing slots at Knights Casino!, your cash out is %" + player.getCash());
        
    }
    
    //returns a symbol for the array.
    private char randomSymbol() {
    
        int num = rands.nextInt(SYMBOLS.length);
        char symbol = ' ';
        
        switch(num) {
            case 0:
                symbol = SYMBOLS[0];
                break;
            case 1:
                symbol = SYMBOLS[1];
                break;
            case 2:
                symbol = SYMBOLS[2];
                break;
            case 3:
                symbol = SYMBOLS[3];
                break;
            case 4:
                symbol = SYMBOLS[4];
                break;
            case 5:
                symbol = SYMBOLS[5];
                break;                
        }
        
        return symbol;
    }
    
}
