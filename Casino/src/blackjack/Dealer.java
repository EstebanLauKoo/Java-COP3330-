/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import constants.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author esteb
 */
public class Dealer implements IDealer {
    
    private ArrayList<Card> hand;
    private int score;
    
    @Override
    
    public Card deal(Deck deck) {
    
        Card card = new Card();
        
        Iterator<Card> c = deck.getDeck().iterator();
        
        if (c.hasNext()) {
        
           card = c.next();
        }
        
        deck.getDeck().remove(card);
        
        return card;
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
    
    public int hitOrStand() {
    
        if (score <= Constants.DEALER_HIT)
            return Constants.HIT;
        else
            return Constants.STAND;
        
    }

    


    
    
}
