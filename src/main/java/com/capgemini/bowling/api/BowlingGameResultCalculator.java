package com.capgemini.bowling.api;

public interface BowlingGameResultCalculator {

	/**
	 * Register a thrown a ball.
	 * @param numberOfPins number of knocked down pins
	 */
	int roll(int numberOfPins);

	/**
	 * @return current game score
	 */
	int score();

	/**
	 * @return true if a game is over, otherwise false
	 */
	boolean isFinished();
}

