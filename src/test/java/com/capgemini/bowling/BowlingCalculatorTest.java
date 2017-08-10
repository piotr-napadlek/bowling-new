package com.capgemini.bowling;

import com.capgemini.bowling.api.BowlingGameResultCalculator;
import com.capgemini.bowling.fixture.BowlingCalculatorTestData;
import com.capgemini.bowling.fixture.BowlingCalculatorTestDataSet;
import com.capgemini.bowling.impl.BowlingGameResultCalculatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BowlingCalculatorTest {
	private BowlingCalculatorTestData testData;
	private BowlingGameResultCalculator bowlingCalculator = new BowlingGameResultCalculatorImpl();
		
	public BowlingCalculatorTest(BowlingCalculatorTestData testData) {
		this.testData = testData;
	}

	@Parameters
	public static Collection<BowlingCalculatorTestData> rollHistory() {
		return BowlingCalculatorTestDataSet.getRollHistoryData();
	}

	@Test
	public void shouldReturnExpectedScoreBasedOnGameHistory() {
		// given
		testData.getRolls().forEach(singleRoll -> bowlingCalculator.roll(singleRoll));
		// when
		int calculatedScore = bowlingCalculator.score();
		// then
		assertEquals(testData.getExpectedScore(), calculatedScore);
	}

	
	@Test
	public void shouldCheckIfGameIsFinished() {
		// given
		testData.getRolls().forEach(singleRoll -> bowlingCalculator.roll(singleRoll));
		// when
		boolean isFinishedActualState = bowlingCalculator.isFinished();
		// then
		assertEquals(testData.expectedIsFinishedState(), isFinishedActualState);
	}
}
