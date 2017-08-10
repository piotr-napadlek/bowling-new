package com.capgemini.bowling.impl;

public class FinalFrame extends Frame {
    static final int FINAL_FRAME_ROLL_LIMIT = FRAME_ROLL_LIMIT + 1;

    @Override
    public boolean isFrameClosed() {
        int rollsAmount = getRollAmount();
        return rollsAmount == FINAL_FRAME_ROLL_LIMIT || (rollsAmount == FRAME_ROLL_LIMIT && noBonusRollAvailable());
    }

    @Override
    protected void validateRollsSum(int numberOfPins) {
        int maxFinalFrameScore = MAX_FRAME_SCORE * FINAL_FRAME_ROLL_LIMIT;
        if (getRollsSum() + numberOfPins > maxFinalFrameScore) {
            throw new IllegalArgumentException("Impossible to roll more than " + maxFinalFrameScore + " in final frame throws!");
        }
    }

    private boolean noBonusRollAvailable() {
        return getRollsSum() < MAX_FRAME_SCORE;
    }
}
