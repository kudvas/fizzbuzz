package com.sk.fizzbuzz;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FizBuzzRunnerTest {

    @Test
    public void appliesGivenFunctionGivenNumberOfTimes() {
        assertEquals(IntStream.rangeClosed(1, 50).mapToObj(String::valueOf).collect(Collectors.joining("\n")), FizBuzzRunner.play(x -> x.toString(), 50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNullFunctionThrowAnException() {
        FizBuzzRunner.play(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeLimitsThrowAnException() {
        FizBuzzRunner.play(x -> x.toString(), -10);
    }

}