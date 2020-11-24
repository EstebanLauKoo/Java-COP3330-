/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import casino.Casino;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author esteb
 */
public class CasinoUi implements ActionListener{
    
    private JFrame frame;
    private Casino casino;
    private PlayerUi playerUi;
    private SlotsUi slotsUi;
    private BlackJackUi blackJackUi;
    private ScratchOffsUi scratchOffsUi;
    JPanel casinoPanel;
    JPanel buttonPanel;
    JPanel gamePanel;
    JPanel blackJackPanel;
    JPanel scratchOffPanel;
    JPanel slotsPanel;
    JButton slots;
    JButton blackJack;
    JButton scratchers;
    final static String SLOTS = "Slots";
    final static String BLACK_JACK = "Black Jack";
    final static String SCRATCH_OFFS = "Scratch Offs";
    private CardLayout cardLayout;
    
    public CasinoUi (Casino casino) {
    
        this.casino = casino;
        
        initObjects();
        initComponents();
        
    }
    
    private void initObjects() {
        
        playerUi = new PlayerUi(casino.getPlayer());
        blackJackUi = new BlackJackUi(casino.getPlayer(), this);
        slotsUi = new SlotsUi(casino.getPlayer(), this);
        scratchOffsUi = new ScratchOffsUi(casino.getPlayer(), this);
        cardLayout = new CardLayout();
        
    }
    
    private void initComponents() {
        
        frame = new JFrame("Knights Casino");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        
        buttonPanel = new JPanel();
        
        slots = new JButton(SLOTS);
        slots.addActionListener(this);
        
        blackJack = new JButton(BLACK_JACK);
        blackJack.addActionListener(this);
        
        scratchers = new JButton(SCRATCH_OFFS);
        scratchers.addActionListener(this);
        
        buttonPanel.add(blackJack, BLACK_JACK);
        buttonPanel.add(slots, SLOTS);
        buttonPanel.add(scratchers, SCRATCH_OFFS);
        
        gamePanel = new JPanel();
        gamePanel.setLayout(cardLayout);
        gamePanel.setPreferredSize(new Dimension(300, 300));
        gamePanel.setBorder(BorderFactory.createTitledBorder("Games"));
        
        gamePanel.add(blackJackUi, BLACK_JACK);
        gamePanel.add(slotsUi, SLOTS);
        gamePanel.add(scratchOffsUi, SCRATCH_OFFS);
        
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(playerUi, BorderLayout.WEST);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        cardLayout.show(gamePanel, (String)ae.getActionCommand());
        frame.revalidate();;
        frame.repaint();
    
    }
    
    public void updatePlayerUi() {
    
        playerUi.getCashBalance().setText(Integer.toString(playerUi.getPlayer().getCash()));
    
    }
    
    
    
    
}
