package com.karmen;

public class Main {

    public static void main(String[] args) {

        DiceResultGenerator diceResultGenerator = new DiceResultGenerator();
        //diceResultGenerator.diceRoll("20D4");
        //diceResultGenerator.diceRoll("20D4+5");
        diceResultGenerator.diceRoll("20D4-37");
        diceResultGenerator.diceRoll("D4-55");
        diceResultGenerator.diceRoll("D3-55");
        diceResultGenerator.diceRoll("12D3-55");
    }

}
