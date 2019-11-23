package com.sk.fizzbuzz;


import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizBuzzRunner {

    public static String play(Function<Integer, String> play, int limit) {
        if (Objects.isNull(play)) {
            throw new IllegalArgumentException("Function cannot be null");
        }
        if (limit < 0) {
            throw new IllegalArgumentException("limit should be more than 0");
        }
        return IntStream.rangeClosed(1, limit).mapToObj(x -> play.apply(x)).collect(Collectors.joining("\n"));
    }
}
