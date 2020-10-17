/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author esteb
 */
import constants.Constants.Color;
import constants.Constants.Face;
import constants.Constants.Suit;

public class Card {

    private Face face;
    private Suit suit;
    private Color color;

    /**
     * @return the face
     */
    public Face getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    public int hashCode() {
        
        int hashcode = 0;
        
        return hashcode;
        
    }
    
    public boolean equals(Object object) {
        
        if (object instanceof Card) {
        
        Card card = (Card) object;
        
        return(card.face.equals(this.face) && card.color.equals(this.color) && card.suit.equals(this.suit));
        
        }
        
        else {
            
        return false;
        
        }
    }

}
