package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void oneBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}
    @Test
    public void twoBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));}
    @Test
    public void threeBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));}
    @Test
    public void leftBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("["));}
    @Test
    public void rightBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("]"));}
    @Test
    public void flippedBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}
    @Test
    public void wordBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));}
    @Test
    public void twoWordBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello] [Elijah]"));}
    @Test
    public void NegativeBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));}
    @Test
    public void wordDoubleBracketTest(){assertTrue(BalancedBrackets.hasBalancedBrackets("[[Hello]]"));}
    @Test
    public void sneakyLeftBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));}
    @Test
    public void sneakyRightBracketTest(){assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));}

}


