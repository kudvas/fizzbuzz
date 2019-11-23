package com.sk.fizzbuzz;

import com.sk.fizzbuzz.enums.Stage;
import com.sk.fizzbuzz.factory.FizzBuzzFactory;

import java.util.function.Function;

public class FizzBuzzApp {
    public static void main(String[] args) {
        System.out.println("Starting fizzBuzz. Stage One ");
        Function playRuleOne = FizzBuzzFactory.createPlay(Stage.STAGE_1);
        String outPut = FizBuzzRunner.play(playRuleOne, 100);
        System.out.println(outPut);

        System.out.println("============================ ");
        System.out.println("Starting fizzBuzz. Stage Two ");
        Function playRuleTwo = FizzBuzzFactory.createPlay(Stage.STAGE_2);
        outPut = FizBuzzRunner.play(playRuleTwo, 100);
        System.out.println(outPut);
    }
}
