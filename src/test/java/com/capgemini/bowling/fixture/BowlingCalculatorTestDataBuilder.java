package com.capgemini.bowling.fixture;// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BowlingCalculatorTestDataBuilder
        extends BowlingCalculatorTestDataBuilderBase<BowlingCalculatorTestDataBuilder> {
    public BowlingCalculatorTestDataBuilder() {
        super(new BowlingCalculatorTestData());
    }

    public static BowlingCalculatorTestDataBuilder bowlingCalculatorTestData() {
        return new BowlingCalculatorTestDataBuilder();
    }

    public BowlingCalculatorTestData build() {
        return getInstance();
    }
}

class BowlingCalculatorTestDataBuilderBase<GeneratorT extends BowlingCalculatorTestDataBuilderBase<GeneratorT>> {
    private BowlingCalculatorTestData instance;

    protected BowlingCalculatorTestDataBuilderBase(BowlingCalculatorTestData aInstance) {
        instance = aInstance;
    }

    protected BowlingCalculatorTestData getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withRolls(List<Integer> aValue) {
        instance.setRolls(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withRolls(int... aValues) {
        instance.setRolls(IntStream.of(aValues).boxed().collect(Collectors.toList()));

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withAddedRoll(Integer aValue) {
        if (instance.getRolls() == null) {
            instance.setRolls(new ArrayList<Integer>());
        }

        (instance.getRolls()).add(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withExpectedScore(int aValue) {
        instance.setExpectedScore(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withExpectedFrameNumber(int aValue) {
        instance.setExpectedFrameNumber(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withExpectedFinishedState(boolean aValue) {
        instance.setExpectedFinishedState(aValue);

        return (GeneratorT) this;
    }
}
