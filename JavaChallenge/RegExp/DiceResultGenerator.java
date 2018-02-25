package com.karmen;

import java.util.Random;
import java.util.Scanner;

public class DiceResultGenerator {

    private int numberOfDices;
    private int diceType;
    private int modifier;

    public DiceResultGenerator(String src) {
        diceNumber(src);
        diceType(src);
        throwModifier(src);
    }

    public void printValues(){
        System.out.println("No. of dices: " + this.numberOfDices + ", dice type: " + this.diceType
                + ", throw modifier: " + this.modifier);
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
                //System.out.println("Number of dices: " + numberOfDices);
                numberOfDices = sNumberOfDices.nextInt();
                sNumberOfDices.close();
            } else {
                //System.out.println("Number of dices: " + numberOfDices);
                numberOfDices = 1;
                sNumberOfDices.close();
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
        if (checkCommand(source)) {
            // here the input String meets requirements of regular expression
            // now it has to be decided is there + or - in the expression
            Scanner s = new Scanner(source).useDelimiter("");
            if (s.findInLine("-") != null) {
                int index = source.indexOf("-");
                modifier = Integer.parseInt(source.substring(index));
                s.close();
            } else if (s.findInLine("\\+") != null){
                int index = source.indexOf("+")+1;
                modifier = Integer.parseInt(source.substring(index));
                s.close();
            } else {
                s.close();
            }
        }
    }

    public int randomThrow(){
        int sumOfThrows = 0;
        for (int i = 1;i<=numberOfDices;i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(diceType)+1;
            System.out.println("Random number "+i+" is: " + randomNum);
            sumOfThrows = sumOfThrows + randomNum;
            System.out.println("Sum is: " + sumOfThrows);
        }
        System.out.println("************************************************");
        return sumOfThrows + modifier;
    }
}

