package com.karmen;

import java.util.Scanner;

public class DiceResultGenerator {

    private int numberOfDices;
    private int diceType;
    private int modifier;

    public DiceResultGenerator() {
    }

    public static boolean checkCommand(String source) {
        String pattern = "(\\d+)?D(3|4|6|8|100|12|20|10)((\\+|-)\\d+)?";
        return source.matches(pattern);
    }

    private void diceNumber(String source) {
        if (checkCommand(source)) {
            // number of dices is located between index 0 and "D". If "D" is first then there is one checkCommand
            Scanner sNumberOfDices = new Scanner(source).useDelimiter("D");
            if (sNumberOfDices.hasNextInt()) {
                System.out.println("Number of dices: " + numberOfDices);
                numberOfDices = sNumberOfDices.nextInt();
            } else {
                System.out.println("Number of dices: " + numberOfDices);
                numberOfDices = 1;
            }
        } else {
            System.out.println("This is not a correct String!");
        }
    }

    private void diceType(String source) {
        // this variable is present between "D" and "-". This can be achieved by another regular expression
        if (checkCommand(source)) {
            if (source.matches(".*D3.*")) {
                diceType = 3;
            } else if (source.matches(".*D4.*")) {
                diceType = 4;
            } else if (source.matches(".*D6.*")) {
                diceType = 6;
            } else if (source.matches(".*D8.*")) {
                diceType = 8;
            } else if (source.matches(".*D10.*")) {
                diceType = 10;
            } else if (source.matches(".*D12.*")) {
                diceType = 12;
            } else if (source.matches(".*D20.*")) {
                diceType = 20;
            } else if (source.matches(".*D100.*")) {
                diceType = 100;
            } else {
                System.out.println("This is not a correct dice!");
            }
        }
    }

    private void throwModifier(String source) {

        String pattern = "(\\d+)?D(3|4|6|8|100|12|20|10)((\\+|-)\\d+)?";

        if (source.matches(pattern)) {
            // here the input String meets requirements of regular expression
            // now it has to be decided is there + or - in the expression
            Scanner s = new Scanner(source).useDelimiter("");
            if (s.findInLine("-") != null || s.findInLine("\\+") != null) {

                // TODO make following code another private function and call it here:

                System.out.println("Type of checkCommand: D" + diceType);
                // still extraction of additional number is required. its done by another scanner
                Scanner sc = new Scanner(source).useDelimiter("-");
                if (sc.hasNextInt()) {
                    modifier = sc.nextInt();
                    System.out.println("Modifier:" + modifier);
                }
            }
            s.close();
        }
    }
}

