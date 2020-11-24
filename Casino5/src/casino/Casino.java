/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import blackjack.BlackJack;
import constants.Constants;
import java.util.Scanner;
import scratchoffs.ScratchOffs;
import slots.Slots;
import userInterface.CasinoUi;

/**
 *
 * @author Karin Whiting UCF COP 3330
 */
public class Casino
{
    // member variables
    private static BlackJack blackJack;
    private static ScratchOffs scratchers;
    private static Slots slots;
    private static Player player;
    private static Scanner scan;
    private static CasinoUi ui;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int game = 0;  
        
        // instantiate the scanner object
        scan = new Scanner(System.in);

        // instantiate the player object
        player = new Player();
        
        // display the game menu
//        game = displayMenu();
//        
//        game = DisplayGameMenu();
       
        ui = new CasinoUi(new Casino());

//        switch(game)
//        {
//            case Constants.BLACK_JACK:
//                blackJack = new BlackJack(player);
//                blackJack.play();
//                break;
//            case Constants.SCRATCH:
//                scratchers = new ScratchOffs(player);
//                scratchers.play();
//                break;
//            case Constants.SLOTS:
//                slots = new Slots(player);  
//                slots.play();
//                break;
//            default:
//                System.out.println("Invalid game selection, try again");
//        }
    }



    private static int displayMenu()
    {
        int select = 0;
        
        System.out.println("Welcome to Knights Casino!");
        System.out.println("");
        
        do
        {
            System.out.println("Select the game to play");
            System.out.println("1. Black Jack");
            System.out.println("2. Scratch Off Tickets");
            System.out.println("3. Slot Machines");

            System.out.println("Enter the number of your choice: ");
            select = scan.nextInt();
        
        } while(select < Constants.BLACK_JACK || select > Constants.SLOTS);
        
        return select;
    }

    public static BlackJack getBlackJack() {
        return blackJack;
    }

    public static void setBlackJack(BlackJack aBlackJack) {
        blackJack = aBlackJack;
    }

    public static ScratchOffs getScratchers() {
        return scratchers;
    }

    public static void setScratchers(ScratchOffs aScratchers) {
        scratchers = aScratchers;
    }

    public static Slots getSlots() {
        return slots;
    }

    public static void setSlots(Slots aSlots) {
        slots = aSlots;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player aPlayer) {
        player = aPlayer;
    }
    
}
