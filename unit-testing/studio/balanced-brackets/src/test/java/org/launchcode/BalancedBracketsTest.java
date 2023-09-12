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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    //no brackets
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedBracketsAroundWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    //balanced brackets inside word returns true
    public void balancedBracketsInsideWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("wo[rd]"));
    }

    @Test
    //one bracket returns false
    public void oneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("wo[rd"));
    }
    @Test
    //wacky brackets return false
    public void bracketsInWrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInsideWordInWrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("wo]rd["));
    }

    @Test
    //odd number of brackets
    public void oddNumberOfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    //odd number of brackets starting with closing brackets
    public void oddNumOfBracketsStartingClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]wo[rds]"));
    }

    @Test
    //no closing bracket
    public void noClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }
}
