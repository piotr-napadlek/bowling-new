package com.capgemini.bowling.fixture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BowlingCalculatorTestDataSet {

    public static Collection<BowlingCalculatorTestData> getRollHistoryData() {
        List<BowlingCalculatorTestData> testSet = new ArrayList<>();

        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0)
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 0, 0)
                            .withExpectedScore(10)
                            .withExpectedFrameNumber(3)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 10, 0)
                            .withExpectedScore(30)
                            .withExpectedFrameNumber(3)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 10, 10, 10)
                            .withExpectedScore(90)
                            .withExpectedFrameNumber(5)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 10, 10)
                            .withExpectedScore(60)
                            .withExpectedFrameNumber(4)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 5, 5)
                            .withExpectedScore(30)
                            .withExpectedFrameNumber(3)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 5, 5, 3, 2)
                            .withExpectedScore(38)
                            .withExpectedFrameNumber(4)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 10, 10, 10)
                            .withExpectedScore(36)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5)
                            .withExpectedScore(9)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5)
                            .withExpectedScore(15)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5)
                            .withExpectedScore(150)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
                            .withExpectedScore(300)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 0, 0, 10, 0, 0, 10, 0, 0, 10, 0, 0, 10, 0, 0)
                            .withExpectedScore(50)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0)
                            .withExpectedScore(100)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 10, 5, 5, 0, 10, 10, 10, 10)
                            .withExpectedScore(105)
                            .withExpectedFrameNumber(7)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls()
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(1)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0)
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(1)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0)
                            .withExpectedScore(0)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10)
                            .withExpectedScore(10)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(5, 5)
                            .withExpectedScore(10)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(5, 5, 5)
                            .withExpectedScore(20)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 10, 5)
                            .withExpectedScore(20)
                            .withExpectedFrameNumber(2)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(0, 0, 0, 10, 5)
                            .withExpectedScore(20)
                            .withExpectedFrameNumber(3)
                            .withExpectedFinishedState(false)
                            .build());
        testSet.add(BowlingCalculatorTestDataBuilder.bowlingCalculatorTestData()
                            .withRolls(10, 9, 1, 5, 5, 7, 2, 10, 10, 10, 9, 0, 8, 2, 9, 1, 10)
                            .withExpectedScore(187)
                            .withExpectedFrameNumber(10)
                            .withExpectedFinishedState(true)
                            .build());

        return testSet;
    }
}
