package com.karmen;

import java.util.Scanner;

public class DiceResultGenerator {

    private int numberOfDices;
    private int diceType;
    private int modifier;

    public DiceResultGenerator() {
    }

    public static boolean dice(String source){
        String pattern = "(\\d+)?D(3|4|6|8|100|12|20|10)((\\+|-)\\d+)?";
        System.out.println(source.matches(pattern));
        return source.matches(pattern);
    }

    public int diceRoll(String source){
        String pattern = "(\\d+)?D(3|4|6|8|100|12|20|10)((\\+|-)\\d+)?";

        if (source.matches(pattern)){
            // here the input String meets requirements of regular expression
            // now it has to be decided is there + or - in the expression
            Scanner s = new Scanner(source).useDelimiter("");
            if (s.findInLine("-")!=null||s.findInLine("\\+")!=null){
                // if there is + or - we have 3 variables: number of dices, type of dices, modifier
                // number of dices is located between index 0 and "D". If "D" is first then there is one dice
                Scanner sNumberOfDices = new Scanner(source).useDelimiter("D");
                if (sNumberOfDices.hasNextInt()){
                    numberOfDices = sNumberOfDices.nextInt();
                    System.out.println("Number of dices: " + numberOfDices);
                } else {
                    numberOfDices = 1;
                    System.out.println("Number of dices: " + numberOfDices);
                }
                // the number of dices is now defined. There is need to also define what kind of dice to use
                // this variable is present between "D" and "-". This can be achieved by another regular expression
                // TODO make following code another private function and call it here:
                if (source.matches(".*D3.*")){
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
                }

                System.out.println("Type of dice: D" + diceType);
                // still extraction of additional number is required. its done by another scanner
                Scanner sc = new Scanner(source).useDelimiter("-");
                if (sc.hasNextInt()){
                    modifier = sc.nextInt();
                    System.out.println("Modifier:" + modifier);
                }
            }
            s.close();
            return 1;
        } else {
            return 0;
        }
    }
}
