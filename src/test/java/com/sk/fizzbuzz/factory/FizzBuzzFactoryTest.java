package com.sk.fizzbuzz.factory;

import com.sk.fizzbuzz.enums.Stage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzFactoryTest {

    @Test
    public void createdStageOneRuleWhenRequested() {
        assertEquals(FizzBuzzFactory.createPlay(Stage.STAGE_1), FizzBuzzRules.stageOneRules());
    }

    @Test
    public void createdStageTwoRuleWhenRequested() {
        assertEquals(FizzBuzzFactory.createPlay(Stage.STAGE_1), FizzBuzzRules.stageOneRules());
    }

    @Test
    public void createdDefaultRuleWhenRulesDontMatchToOnesPreconfigured() {
        assertEquals(FizzBuzzFactory.createPlay(Stage.STAGE_3), FizzBuzzRules.defaultFunction());
    }
}