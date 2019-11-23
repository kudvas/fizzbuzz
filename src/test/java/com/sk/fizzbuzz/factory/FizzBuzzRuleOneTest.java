package com.sk.fizzbuzz.factory;

import org.junit.Test;

import static com.sk.fizzbuzz.factory.FizzBuzzRules.stageOneRules;
import static org.junit.Assert.assertEquals;

public class FizzBuzzRuleOneTest {

    @Test
    public void givenMultiplesOfThreePrintOnlyFizz() {
        assertEquals("Fizz", stageOneRules().apply(3));
        assertEquals("Fizz", stageOneRules().apply(96));
        assertEquals("Fizz", stageOneRules().apply(99));
        assertEquals("Fizz", stageOneRules().apply(63));
    }


    @Test
    public void givenMultiplesOfOnly5PrintOnlyBuzz() {
        assertEquals("Buzz", stageOneRules().apply(5));
        assertEquals("Buzz", stageOneRules().apply(100));
        assertEquals("Buzz", stageOneRules().apply(25));
        assertEquals("Buzz", stageOneRules().apply(50));
    }

    @Test
    public void givenMultiplesOfBothThreeAndFivePrintFizzBuzz() {
        assertEquals("FizzBuzz", stageOneRules().apply(15));
        assertEquals("FizzBuzz", stageOneRules().apply(45));
        assertEquals("FizzBuzz", stageOneRules().apply(90));

    }


    @Test
    public void givenZeroOrNegativeOrNullPrintTheNumberAsIs() {
        assertEquals("0", stageOneRules().apply(0));
        assertEquals("-1", stageOneRules().apply(-1));
        assertEquals("null", stageOneRules().apply(null));
    }

    @Test
    public void givenAllOtherNumbersPrintNumberAsIs() {
        assertEquals("2", stageOneRules().apply(2));
        assertEquals("97", stageOneRules().apply(97));
        assertEquals("22", stageOneRules().apply(22));
    }


}