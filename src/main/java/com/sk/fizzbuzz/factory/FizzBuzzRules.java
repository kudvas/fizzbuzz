package com.sk.fizzbuzz.factory;

import java.util.function.Function;

public class FizzBuzzRules {
    public static Function<Integer, String> stageOneRules() {
        return (x) -> {
            if (preconditionCheck(x)) return String.valueOf(x);
            if (x % 15 == 0) {
                return "FizzBuzz";
            } else if (x % 3 == 0) {
                return "Fizz";
            } else if (x % 5 == 0) {
                return "Buzz";
            } else {
                return x.toString();
            }
        };
    }

    public static Function<Integer, String> stageTwoRules() {
        return (x) -> {
            if (preconditionCheck(x)) return String.valueOf(x);

            if (divisibleOrContains(x, 3, "3") && divisibleOrContains(x, 5, "5")) {
                return "FizzBuzz";
            } else if (divisibleOrContains(x, 3, "3")) {
                return "Fizz";
            } else if (divisibleOrContains(x, 5, "5")) {
                return "Buzz";
            } else {
                return x.toString();
            }
        };
    }

    private static boolean preconditionCheck(Integer x) {
        if (x == null || x <= 0) {
            return true;
        }
        return false;
    }

    private static boolean divisibleOrContains(Integer number, int i, String value) {
        return number % i == 0 || String.valueOf(number).contains(value);
    }

    public static Function<Integer, String> defaultFunction() {
        return x -> x.toString();
    }
}
