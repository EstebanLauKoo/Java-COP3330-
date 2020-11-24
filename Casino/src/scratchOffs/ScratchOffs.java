/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchOffs;

import casino.Player;
import constants.Constants;
import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class ScratchOffs {

    private Player player;
    private boolean play;
    private Scanner scnr;

    public ScratchOffs(Player player) {

        this.player = player;
        play = true;
        scnr = new Scanner(System.in);

    }

    public void play() {

        int type;
        int quantity;
        int input;

        System.out.println("Let's play scratch off tickets!");
        System.out.println("Players can select from One Dollar, Five Dollar, and Ten Dollar tickets");
        System.out.println("Prizes are based on the ticket selected");

        if (player.getCash() < Constants.ONE_DOLLAR) {

            System.out.println("You are out of cash, you cannot play");
            play = false;

        }

        while (play) {

            System.out.println("Which type of scratch off would you like (1 = One Dollar, 5 = Five Dollar, 10 = Ten Dollar)?");
            type = scnr.nextInt();
            System.out.println("How many scratch offs would you like?");
            quantity = scnr.nextInt();
            System.out.println("Getting your scratch offs...");

            for (int i = 0; i < quantity; i++) {

                switch (type) {

                    case Constants.ONE_DOLLAR:
                        player.setCash(player.getCash() - Constants.ONE_DOLLAR);
                        OneDollar onedollar = new OneDollar(player);
                        break;
                    case Constants.FIVE_DOLLAR:
                        player.setCash(player.getCash() - Constants.FIVE_DOLLAR);
                        FiveDollar fivedollar = new FiveDollar(player);
                        break;
                    case Constants.TEN_DOLLAR:
                        player.setCash(player.getCash() - Constants.TEN_DOLLAR);
                        TenDollar tendollar = new TenDollar(player);
                        break;

                }

            }

            if (player.getCash() > Constants.ONE_DOLLAR) {
                System.out.println("Do you want to play again? (1 for yes 2 for no)");
                input = scnr.nextInt();
                if (input == 1) {
                    play = true;
                } else {
                    play = false;
                    break;
                }

            }

        }

    }

}
