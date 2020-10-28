/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import constants.Constants;
import constants.Constants.Face;
import constants.Constants.Suit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

/**
 *
 * @author esteb
 */
public class Deck {
    
    private Set<Card> deck;
    
    public Deck() {
    
//        System.out.println("***************************");
//        System.out.println("Shuffling the deck of cards");
//        System.out.println("***************************");
        generateDeck();
//        
//        System.out.println("***************************");
//        System.out.println("Displaying the shuffled deck of cards");
//        System.out.println("***************************");
//        displayDeck();
//        
//        System.out.println("***************************");
//        System.out.println("Shuffling the deck of cards");
//        System.out.println("***************************");
         shuffleDeck();
//        
//        System.out.println("*************************************");
//        System.out.println("Displaying the shuffled deck of cards");
//        System.out.println("*************************************");;
//        displayDeck();
                
    }
    
    public void generateDeck() {
    
        deck = new HashSet<Card>(Constants.NUM_CARDS);
        
        for (Face face : Face.values()) {
            for (Suit suit : Suit.values()) {
                
                Card card = new Card();
                card.setFace(face);
                card.setSuit(suit);

                if (card.getSuit() == constants.Constants.Suit.DIAMONDS || card.getSuit() == constants.Constants.Suit.HEARTS) {
                    
                card.setColor(constants.Constants.Color.RED);
                
                }
                
                else {
                    
                card.setColor(constants.Constants.Color.BLACK);
                
                }
                
                if(deck.contains(card) == true) {
                    
                
                } 
                
                else {
                    
                deck.add(card);
                
                }
             

                          
            }
        }
        
    }
    
    public void displayDeck() {
        
        System.out.println("Deck size: " + constants.Constants.NUM_CARDS + " cards");
        System.out.println("Deck includes:");
        
        // iterates througg the hash set outputing the face value, suit, and color of each card
        Iterator<Card> it = deck.iterator();
        
        while(it.hasNext()) 
        {

            Card i = it.next();
            System.out.println("Card: " + i.getFace() + " of " + i.getSuit() + " is color "  + i.getColor());

        }   
        
    }
    
    public void shuffleDeck() {
        
        ArrayList<Card> arrayList= new ArrayList<Card>(deck);
   
        Collections.shuffle(arrayList);
        
        deck = new HashSet<Card>(arrayList);
        
    }

    public Set<Card> getDeck() {
        return deck;
    }

    public void setDeck(Set<Card> deck) {
        this.deck = deck;
    }
    
}
