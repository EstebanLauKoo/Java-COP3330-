/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JPanel;
import casino.Player;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author esteb
 */
public class BlackJackUi extends JPanel {
    
    private CasinoUi casinoUi;
    private Player player;
    private JLabel data;
    
    public BlackJackUi (Player player, CasinoUi casinoUi) {
    
        this.player = player;
        this.casinoUi = casinoUi;
        
        initComponents();
    
    }
    
    private void initComponents() {
        
        data = new JLabel("welcome to Knights Casino Black Jack");
        this.add(data);
    
    }
    
}
