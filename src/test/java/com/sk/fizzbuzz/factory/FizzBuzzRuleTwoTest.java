package com.sk.fizzbuzz.factory;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static com.sk.fizzbuzz.factory.FizzBuzzRules.stageTwoRules;
import static org.junit.Assert.assertEquals;

public class FizzBuzzRuleTwoTest {

    @Test
    public void givenMultiplesOfThreeOrThreeInItPrintFizz() {
        assertEquals("Fizz", stageTwoRules().apply(3));
        assertEquals("Fizz", stageTwoRules().apply(96));
        assertEquals("Fizz", stageTwoRules().apply(32));
        assertEquals("Fizz", stageTwoRules().apply(83));
        assertEquals("Fizz", stageTwoRules().apply(33));
    }

    @Test
    public void givenMultiplesOfFiveOrFiveInItPrintFizz() {
        assertEquals("Buzz", stageTwoRules().apply(5));
        assertEquals("Buzz", stageTwoRules().apply(52));
        assertEquals("Buzz", stageTwoRules().apply(59));
        assertEquals("Buzz", stageTwoRules().apply(95));
        assertEquals("Buzz", stageTwoRules().apply(50));
        assertEquals("Buzz", stageTwoRules().apply(100));
    }

    @Test
    public void givenMultiplesOfBothThreeAndFiveAndFiveOrThreeInDigitsPrintFizzBuzz() {
        assertEquals("FizzBuzz", stageTwoRules().apply(53));
        assertEquals("FizzBuzz", stageTwoRules().apply(35));
        assertEquals("FizzBuzz", stageTwoRules().apply(15));
        assertEquals("FizzBuzz", stageTwoRules().apply(45));
        assertEquals("FizzBuzz", stageTwoRules().apply(90));
        assertEquals("FizzBuzz", stageTwoRules().apply(30));
    }

    @Test
    public void givenZeroOrNegativeOrNullPrintTheNumberAsIs() {
        assertEquals("0", stageTwoRules().apply(0));
        assertEquals("-1", stageTwoRules().apply(-1));
        assertEquals("null", stageTwoRules().apply(null));
    }

    @Test
    public void givenAllOtherNumbersPrintNumberAsIs() {
        assertEquals("2", stageTwoRules().apply(2));
        assertEquals("97", stageTwoRules().apply(97));
        assertEquals("22", stageTwoRules().apply(22));
        assertEquals("41", stageTwoRules().apply(41));
    }

}