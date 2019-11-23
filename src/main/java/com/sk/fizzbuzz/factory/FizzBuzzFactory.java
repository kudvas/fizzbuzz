package com.sk.fizzbuzz.factory;

import com.sk.fizzbuzz.enums.Stage;

import java.util.function.Function;

import static com.sk.fizzbuzz.factory.FizzBuzzRules.*;

public class FizzBuzzFactory {
    public static Function<Integer, String> createPlay(Stage stage) {
        switch (stage) {
            case STAGE_1:
                return stageOneRules();
            case STAGE_2:
                return stageTwoRules();
            default:
                return defaultFunction();
        }
    }


}
