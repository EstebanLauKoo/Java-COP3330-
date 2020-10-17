/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import blackjack.BlackJack;
import constants.Constants;
import java.util.Scanner;
import scratchOffs.ScratchOffs;
import slots.Slots;

/**
 *
 * @author esteb
 */
public class Casino {

    private static BlackJack blackJack;
    private static ScratchOffs scratchOffs;
    private static Slots slots;
    private static Player player;
    private static Scanner scan;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        // Declaring local variable to store player game selection
        int game;
        
        // instantiate the class scanner, and also Player
        scan = new Scanner(System.in);
        
        player = new Player();
        
        // variable game equal to method call displayMenu
        game = displayMenu();
        
        // switch statemeht to identify which game, each case instatiates class. along with fail case.
        switch(game) {
            case Constants.BLACK_JACK:
                blackJack = new BlackJack(player);
                blackJack.play();
                break;
            case Constants.SCRATCH:
                scratchOffs = new ScratchOffs();
                break;
            case Constants.SLOTS:
                slots = new Slots(player);
                slots.play();
                break;
            default: {
                System.out.println("Invalid");
            }
                
        }
    }
    
    // private static displayMenu
    private static int displayMenu() {
        
        // an int called select to return at the end.
        int select;
        
        // print the game menu and prompt user for input. with scan
        do {
            System.out.println("Welcome to Knights Casino!");
            System.out.println("");
            System.out.println("Select a game to play");
            System.out.println("1. Black Jack");
            System.out.println("2. Scratch Off Tickets");
            System.out.println("3. Slot Machines");
            System.out.println("Enter the number of your choice");
            
            select = scan.nextInt();
            
        } while(select < Constants.BLACK_JACK || select > Constants.SLOTS);
        
        return select;
    }
    
}


