package com.karmen;

public class Main {

    public static void main(String[] args) {

        DiceResultGenerator diceResultGenerator1 = new DiceResultGenerator("20D4-37");
        diceResultGenerator1.printValues();
        DiceResultGenerator diceResultGenerator2 = new DiceResultGenerator("D4-56");
        diceResultGenerator2.printValues();
        DiceResultGenerator diceResultGenerator3 = new DiceResultGenerator("D3-42");
        diceResultGenerator3.printValues();
        DiceResultGenerator diceResultGenerator4 = new DiceResultGenerator("12D3-25");
        diceResultGenerator4.printValues();
        DiceResultGenerator diceResultGenerator5 = new DiceResultGenerator("20D4+37");
        diceResultGenerator5.printValues();
        DiceResultGenerator diceResultGenerator6 = new DiceResultGenerator("D4+56");
        diceResultGenerator6.printValues();
        DiceResultGenerator diceResultGenerator7 = new DiceResultGenerator("D3+42");
        diceResultGenerator7.printValues();
        DiceResultGenerator diceResultGenerator8 = new DiceResultGenerator("12D3+25");
        diceResultGenerator8.printValues();

    }

}
