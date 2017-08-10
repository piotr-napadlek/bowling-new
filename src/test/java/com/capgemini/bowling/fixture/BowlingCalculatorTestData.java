package com.capgemini.bowling.fixture;

import java.util.ArrayList;
import java.util.List;

public class BowlingCalculatorTestData {
	private List<Integer> rolls = new ArrayList<>();
	private int expectedScore;
	private int expectedFrameNumber;
	private boolean expectedFinishedState;
	
	public BowlingCalculatorTestData() {
	}

	public BowlingCalculatorTestData(List<Integer> rolls, int expectedScore,
			int expectedFrameNumber, boolean expectedFinishedState) {
		this.rolls = rolls;
		this.expectedScore = expectedScore;
		this.expectedFrameNumber = expectedFrameNumber;
		this.expectedFinishedState = expectedFinishedState;
	}
	
	public List<Integer> getRolls() {
		return rolls;
	}
	
	public int getExpectedScore() {
		return expectedScore;
	}
	
	public int getExpectedFrameNumber() {
		return expectedFrameNumber;
	}
	
	public boolean expectedIsFinishedState() {
		return expectedFinishedState;
	}

	public void setRolls(List<Integer> rolls) {
		this.rolls = rolls;
	}

	public void setExpectedScore(int expectedScore) {
		this.expectedScore = expectedScore;
	}

	public void setExpectedFrameNumber(int expectedFrameNumber) {
		this.expectedFrameNumber = expectedFrameNumber;
	}

	public void setExpectedFinishedState(boolean expectedFinishedState) {
		this.expectedFinishedState = expectedFinishedState;
	}
}
