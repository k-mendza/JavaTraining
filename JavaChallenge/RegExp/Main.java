package com.karmen;

public class Main {

    public static void main(String[] args) {

        DiceResultGenerator diceResultGenerator = new DiceResultGenerator();
        //diceResultGenerator.diceRoll("20D4");
        //diceResultGenerator.diceRoll("20D4+5");
        diceResultGenerator.throwModifier("20D4-37");
        diceResultGenerator.throwModifier("D4-56");
        diceResultGenerator.throwModifier("D3-42");
        diceResultGenerator.throwModifier("12D3-25");
        diceResultGenerator.throwModifier("20D4+37");
        diceResultGenerator.throwModifier("D4+56");
        diceResultGenerator.throwModifier("D3+42");
        diceResultGenerator.throwModifier("12D3+25");
    }

}
