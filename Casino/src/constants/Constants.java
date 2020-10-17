/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/**
 *
 * @author esteb
 */
public class Constants {
    
    public static final int BLACK_JACK = 1;
            
    public static final int SCRATCH = 2;    
   
    public static final int SLOTS = 3;
    
    // bet for slots
    
    public static final int BET = 5;
    
    // payout for slots
    
    public static final int PAIR_PAYOUT = 5;
    
    public static final int TRIPLE_PAYOUT = 50;
    
    // blackJack contants
    
    public static final int NUM_CARDS = 52;
    
    public static final int BJ_BET = 10;
    
    public static final int BJ_WIN = 20;
    
    
    // Blackjack enumeration
    public enum Color {
        RED,
        BLACK
    }
    
    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    
    public enum Face {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE      
    }
    
    
    
}
