package com.karmen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class DiceResultGeneratorTest {

    private DiceResultGenerator diceRoll;
    private String input;
    private int output1;
    private int output2;
    private int output3;

    public DiceResultGeneratorTest(String input, int otp1, int otp2, int otp3){
        this.input = input;
        this.output1 = otp1;
        this.output2 = otp2;
        this.output3 = otp3;
    }

//    @Before
//    public void setup(){
//        diceRoll = new DiceResultGenerator();
//    }



    @Parameterized.Parameters
    public static Iterable<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
                {"", 0, 0, 0},
                {"D3", 1, 3, 0},
                {"D3+5", 1, 3, 5},
                {"D3-5", 1, 3, -5},
                {"2D4", 2, 4 ,0},
                {"20D5", 0, 0, 0},
                {"200D6", 200, 6, 0},
                {"D8", 1, 8, 0},
                {"2D10", 2, 10, 0},
                {"20D12", 20, 12, 0},
                {"200D20", 200, 20, 0}
//                {"200D20+", false},
//                {"200D20-", false},
//                {"200D20+1", true},
//                {"200D20-1", true},
//                {"200D20+10", true},
//                {"200D20-10", true},
//                {"200D20+100", true},
//                {"200D20-100", true}
        });
    }

    @Test
    public void checkValues() {
        diceRoll = new DiceResultGenerator(input);
        assertEquals(output1, diceRoll.getNumberOfDices());
        assertEquals(output2, diceRoll.getDiceType());
        assertEquals(output3, diceRoll.getModifier());
    }
}