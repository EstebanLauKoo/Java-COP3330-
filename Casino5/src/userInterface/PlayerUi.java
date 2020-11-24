/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import casino.Player;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author esteb
 */
public class PlayerUi extends JPanel{
    
    private Player player;
    private JLabel cashLabel;
    private JLabel cashBalance;
    JPanel playerPanel;
    
    public PlayerUi (Player player) {
    
        this.player = player;
        initComponents();
    
    }
    
    private void initComponents() {
    
        String playerInput = JOptionPane.showInputDialog(null, "Enter the name of player");
        
        player.setName(playerInput);
        
        String cashInput = JOptionPane.showInputDialog(null, "Enter cash to play");
        
        player.setCash(Integer.parseInt(cashInput));
        
        playerPanel = new JPanel();
        
        playerPanel.setPreferredSize(new Dimension(100, 600));
        playerPanel.setBorder(BorderFactory.createTitledBorder(player.getName()));
        
        cashLabel = new JLabel("Cash Balance: $");
        cashBalance = new JLabel(Integer.toString(player.getCash()));
        
        playerPanel.add(cashLabel);
        playerPanel.add(cashBalance);
        
        this.add(playerPanel);
        
       
        
    }
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public JLabel getCashLabel() {
        return cashLabel;
    }

    public void setCashLabel(JLabel cashLabel) {
        this.cashLabel = cashLabel;
    }

    public JLabel getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(JLabel cashBalance) {
        this.cashBalance = cashBalance;
    }
    
}
