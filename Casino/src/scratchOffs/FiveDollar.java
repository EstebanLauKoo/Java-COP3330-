/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchOffs;

import casino.Player;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author esteb
 */
public class FiveDollar {

    private char winningBonus;
    private ArrayList<Integer> winningNumbers;
    private ArrayList<Integer> playerNumbers;
    private ArrayList<Double> prizes;
    private ArrayList<Character> bonus;
    private Player player;
    private Random rand;

    private static final char[] SYMBOLS = {'$', '%', '&', '#', '@', '!'};
    private static int BASE = 40;
    private static int NUMS = 10;
    private static int SYMS = 2;
    private static double BONUS = 20.00;

    public FiveDollar(Player player) {

        this.player = player;
        rand = new Random();
        createTicket();
        displayTicket();
        cashTicket();

    }

    private void displayTicket() {

        System.out.println("+-------------------------------------------------+");
        System.out.print("|WINNING NUMBER               ");

        for (int m = 0; m < 2; m++) {

            System.out.print(winningNumbers.get(m) + "      ");

        }
        System.out.println("    |");
        System.out.println("|                                                 |");
        System.out.println("|YOUR NUMBERS                                     |");
        System.out.print("|     ");

        for (int i = 0; i < 5; i++) {

            System.out.print(playerNumbers.get(i) + "       ");

        }

        System.out.println(" |");

        System.out.print("|     ");

        for (int i = 5; i < 10; i++) {

            System.out.print(playerNumbers.get(i) + "       ");

        }

        System.out.println(" |");

        System.out.println("|                                                 |");
        System.out.println("|PRIZES                                           |");
        System.out.println("|                                                 |");

        System.out.print("|     ");

        for (int i = 0; i < 5; i++) {

            System.out.print(String.format("%.2f", prizes.get(i)) + "    ");

        }

        System.out.println("  |");

        System.out.print("|     ");

        for (int i = 5; i < 10; i++) {

            System.out.print(String.format("%.2f", prizes.get(i)) + "    ");

        }

        System.out.println("  |");

        System.out.println("|                                                 |");

        System.out.println("|SYMBOLS                                          |");

        System.out.println("|                                                 |");

        System.out.print("|     ");

        for (Character i : bonus) {

            System.out.print(i + "      ");

        }

        System.out.println("                              |");

        System.out.println("+-------------------------------------------------+");

    }

    private void cashTicket() {

        int cash = 0;
        System.out.println("Bonus symbol is " + winningBonus);
        System.out.println("Bonus is worth $" + BONUS);

        for (Integer i : winningNumbers) {

            for (int j = 0; j < NUMS; j++) {
                if (i == playerNumbers.get(j)) {

                    cash += prizes.get(j);

                }
            }

        }

        for (Character i : bonus) {

            if (i == winningBonus) {

                cash += BONUS;

            }

        }

        player.setCash(player.getCash() + cash);
        System.out.println("Your One Dollar Scratch Off won you $" + cash);
        System.out.println("CASH = " + player.getCash());

    }

    private void createTicket() {

        winningBonus = randomSymbol();

        winningNumbers = new ArrayList<Integer>();
        playerNumbers = new ArrayList<Integer>();
        prizes = new ArrayList<Double>();
        bonus = new ArrayList<Character>();

        for (int k = 0; k < 2; k++) {

            winningNumbers.add(randomNumber());

        }

        for (int i = 0; i < 10; i++) {

            playerNumbers.add(randomNumber());
            prizes.add(randomPrize());

        }

        for (int j = 0; j < 2; j++) {

            bonus.add(randomSymbol());

        }

    }

    private int randomNumber() {

        int randomNumberValue;

        randomNumberValue = rand.nextInt(BASE + 1);

        return randomNumberValue;
    }

    private double randomPrize() {

        double randomPrizeValue;

        randomPrizeValue = rand.nextInt(BASE + 1);

        return randomPrizeValue;
    }

    private char randomSymbol() {

        int num = rand.nextInt(SYMBOLS.length);
        char symbol = ' ';

        switch (num) {
            case 0:
                symbol = SYMBOLS[0];
                break;
            case 1:
                symbol = SYMBOLS[1];
                break;
            case 2:
                symbol = SYMBOLS[2];
                break;
            case 3:
                symbol = SYMBOLS[3];
                break;
            case 4:
                symbol = SYMBOLS[4];
                break;
            case 5:
                symbol = SYMBOLS[5];
                break;
        }

        return symbol;
    }

}
