package Udemy.CompleteJavaMasterclass.UnitTests.Challenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        Utilities util = new Utilities();
        char[] hello = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, hello);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8));
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABBCCDDEEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("", util.removePairs(""));
        assertEquals("A", util.removePairs("A"));
    }

    @org.junit.Test
    public void converter() {
        Utilities util = new Utilities();
        assertEquals(300,util.converter(10, 5));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        Utilities util = new Utilities();
        assertEquals(null,util.nullIfOddLength("thisisodd"));
        assertEquals("thisisnotodd",util.nullIfOddLength("thisisnotodd"));
    }
}