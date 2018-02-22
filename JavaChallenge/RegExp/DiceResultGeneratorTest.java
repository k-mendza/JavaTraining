package com.karmen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class DiceResultGeneratorTest {

    private DiceResultGenerator diceRoll;
    private String diceCommand;
    private boolean pass;

    public DiceResultGeneratorTest(String input, boolean output){
        this.diceCommand = input;
        this.pass = output;
    }

    @Before
    public void setup(){
        diceRoll = new DiceResultGenerator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
                {"D3",true},
                {"2D4",true},
                {"20D5", false},
                {"200D6", true},
                {"D8", true},
                {"2D10", true},
                {"20D12", true},
                {"200D20", true},
                {"200D20+", false},
                {"200D20-", false},
                {"200D20+1", true},
                {"200D20-1", true},
                {"200D20+10", true},
                {"200D20-10", true},
                {"200D20+100", true},
                {"200D20-100", true}
        });
    }

    @Test
    public void dice() {
        assertEquals(pass, diceRoll.dice(diceCommand));
    }
}