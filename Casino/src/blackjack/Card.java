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
    private int value;

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
    
    public String toString() {
    
        String card = this.face + " of " + this.suit;
        
        return card;
    
    }

    /**
     * @return the value
     */
    public int getValue() {
        value = 0;
        
        if (face == face.TWO)
            value = 2;
        else if(face == face.THREE)
            value = 3;
        else if(face == face.FOUR)
            value = 4;        
        else if(face == face.FIVE)
            value = 5;
        else if(face == face.SIX)
            value = 6;
        else if(face == face.SEVEN)
            value = 7;
        else if(face == face.EIGHT)
            value = 8;
        else if(face == face.NINE)
            value = 9;
        else if(face == face.TEN || 
                face == face.JACK || 
                face == face.QUEEN || 
                face == face.KING)
            value = 10;
        else if(face == face.ACE)
            value = 11;
        
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
