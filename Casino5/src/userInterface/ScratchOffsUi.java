/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import casino.Player;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author esteb
 */
public class ScratchOffsUi extends JPanel{
    
    private CasinoUi casinoUi;
    private Player player;
    private JLabel data;
    
    public ScratchOffsUi (Player player, CasinoUi casinoUi) {
    
        this.player = player;
        this.casinoUi = casinoUi;
        
        initComponents();
        
    }
    
    private void initComponents() {
    
        data = new JLabel("welcome to Knights Casino Scratch Offs");
        this.add(data);
        
    }
    
}
