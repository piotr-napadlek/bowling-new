package com.capgemini.bowling;

import com.capgemini.bowling.api.BowlingGameResultCalculator;
import com.capgemini.bowling.impl.BowlingGameResultCalculatorImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BowlingCalculatorIsFinishedTest {
	private BowlingGameResultCalculator bowlingCalculator = new BowlingGameResultCalculatorImpl();
	
	@Test
	public void shouldReturnProperGameStateAfterTwentyEmptyRolls(){
		//given
		for (int i = 0; i <20; i++){
			bowlingCalculator.roll(0);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertTrue(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterNineteenEmptyRolls(){
		//given
		for (int i = 0; i <19; i++){
			bowlingCalculator.roll(0);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertFalse(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterElevenStrikes(){
		//given
		for (int i = 0; i <11; i++){
			bowlingCalculator.roll(10);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertFalse(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterTwelveStrikes(){
		//given
		for (int i = 0; i <12; i++){
			bowlingCalculator.roll(10);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertTrue(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterTenSpares(){
		//given
		for (int i = 0; i <10; i++){
			bowlingCalculator.roll(5);
			bowlingCalculator.roll(5);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertFalse(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterTenSparesAndEmptyRoll(){
		//given
		for (int i = 0; i <10; i++){
			bowlingCalculator.roll(5);
			bowlingCalculator.roll(5);
		}
		bowlingCalculator.roll(0);
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertTrue(isFinished);
	}
	
	@Test
	public void shouldReturnProperGameStateAfterFiveStrikesAndFiveSpares(){
		//given
		for (int i = 0; i <5; i++){
			bowlingCalculator.roll(10);
			bowlingCalculator.roll(0);
			bowlingCalculator.roll(10);
		}
		//when
		boolean isFinished = bowlingCalculator.isFinished();
		//then
		assertFalse(isFinished);
	}

}
