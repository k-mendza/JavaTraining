package Udemy.CompleteJavaMasterclass.UnitTests.Challenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] hello = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, hello);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8));
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABBCCDDEEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("", util.removePairs(""));
        assertEquals("A", util.removePairs("A"));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300,util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converterArithmeticException() throws Exception {
        assertEquals(300,util.converter(10, 0));
    }


    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals(null,util.nullIfOddLength("thisisodd"));
        assertEquals("thisisnotodd",util.nullIfOddLength("thisisnotodd"));
    }
}