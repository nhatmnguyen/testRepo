package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2 = 4", 4, answer);
    }
    @Test
    public void canDoTwoMinusTwo(){
        int answer = 2-2;
        assertEquals("2 - 2 = 0", 0, answer);
    }
    @Test
    public void canDoFourDivideTwo(){
        int answer = 4/2;
        assertEquals("4 / 2 = 2", 2, answer);
    }
    @Test
    public void canDoTwoMultiplyTwo(){
        int answer = 2*2;
        assertEquals("2 * 2 = 4", 4, answer);
    }
}