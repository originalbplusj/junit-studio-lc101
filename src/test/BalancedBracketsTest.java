package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void valueWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]"));
    }

    @Test
    public void balancedBracketsWithinValueReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsBeforeValueReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsAfterValueReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void emptyParenthesesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyMultipleSetsOfBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void mismatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void singleOpeningBracketInValueReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void singleClosingBracketInValueReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test
    public void mismatchedBracketsWithinValueReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

}
