/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import blackjack.BlackJack;
import contants.Constants;
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
        int game;
        
        scan = new Scanner(System.in);
        
        player = new Player();
        
        game = displayMenu();
        
        switch(game) {
            case Constants.BLACK_JACK:
                blackJack = new BlackJack();
                break;
            case Constants.SCRATCH:
                scratchOffs = new ScratchOffs();
                break;
            case Constants.SLOTS:
                slots = new Slots();
                break;
            default: {
                System.out.println("Invalid");
            }
                
        }
    }
    
    private static int displayMenu() {
        int select;
        
        do {
        
            System.out.println("Select a game to play");
            System.out.println("1. Black Jack");
            System.out.println("2. Scratch Off Tickets");
            System.out.println("Slot Machines");
            System.out.println("Enter the number of your choice");
            
            select = scan.nextInt();
            
        } while(select < Constants.BLACK_JACK || select > Constants.SLOTS);
        
        return select;
    }
    
}


