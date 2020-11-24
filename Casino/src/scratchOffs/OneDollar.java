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
public class OneDollar {

    private char winningBonus;
    private int winningNumber;
    private ArrayList<Integer> playerNumbers;
    private ArrayList<Double> prizes;
    private ArrayList<Character> bonus;
    private Player player;
    private Random rand;

    private static final char[] SYMBOLS = {'$', '%', '&', '#', '@', '!'};
    private static int BASE = 20;
    private static int NUMS = 5;
    private static int SYMS = 2;
    private static double BONUS = 10.00;

    public OneDollar(Player player) {

        this.player = player;
        rand = new Random();
        createTicket();
        displayTicket();
        cashTicket();

    }

    private void displayTicket() {

        System.out.println("+-------------------------------------------------+");
        System.out.println("|WINNING NUMBER       " + winningNumber + "                            |");
        System.out.println("|                                                 |");
        System.out.println("|YOUR NUMBERS                                     |");
        System.out.print("|     ");

        for (Integer i : playerNumbers) {

            System.out.print(i + "       ");

        }

        System.out.println("  |");
        System.out.println("|                                                 |");
        System.out.println("|PRIZES                                           |");
        System.out.println("|                                                 |");

        System.out.print("|     ");

        for (Double i : prizes) {

            System.out.print(String.format("%.2f", i) + "    ");

        }

        System.out.println("   |");

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

        for (int i = 0; i < NUMS; i++) {

            if (playerNumbers.get(i) == winningNumber) {

                cash += prizes.get(i);

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

        winningNumber = randomNumber();

        winningBonus = randomSymbol();
        playerNumbers = new ArrayList<Integer>();
        prizes = new ArrayList<Double>();
        bonus = new ArrayList<Character>();

        for (int i = 0; i < 5; i++) {

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
