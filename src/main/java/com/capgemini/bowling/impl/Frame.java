package com.capgemini.bowling.impl;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    static final int MAX_FRAME_SCORE = 10;
    static final int FRAME_ROLL_LIMIT = 2;
    private static final int STRIKE_ROLL_PINS = 10;

    private List<Integer> frameRolls = new ArrayList<>(3);
    private Frame nextFrame;
    private BonusType bonusType = BonusType.NONE;


    public void acceptRoll(int numberOfPins) {
        validateRoll(numberOfPins);
        frameRolls.add(numberOfPins);
        if (getRollsSum() == MAX_FRAME_SCORE) {
            this.bonusType = firstRollIsStrike() ? BonusType.STRIKE : BonusType.SPARE;
        }
    }

    public void setNextFrame(Frame nextFrame) {
        this.nextFrame = nextFrame;
    }

    public int getTotalFrameScore() {
        return getRollsSum() + getBonusPointsFromNextFrame();
    }

    public boolean isFrameClosed() {
        return firstRollIsStrike() || rollLimitAchieved();
    }

    protected void validateRollsSum(int numberOfPins) {
        if (getRollsSum() + numberOfPins > MAX_FRAME_SCORE) {
            throw new IllegalArgumentException("Impossible to roll more than " + MAX_FRAME_SCORE + " in two throws!");
        }
    }

    int getRollAmount() {
        return frameRolls.size();
    }

    int getRollsSum() {
        return frameRolls.stream().mapToInt(Integer::intValue).sum();
    }

    private void validateRoll(int numberOfPins) {
        validateFrameOpen();
        validateMaxPinsInOneRoll(numberOfPins);
        validateRollsSum(numberOfPins);
    }

    private void validateMaxPinsInOneRoll(int numberOfPins) {
        if (numberOfPins > MAX_FRAME_SCORE) {
            throw new IllegalArgumentException("Impossible to roll more than " + MAX_FRAME_SCORE + " in one throw!");
        }
    }

    private void validateFrameOpen() {
        if (isFrameClosed()) {
            throw new IllegalStateException("Trying to add a roll to already finished frame!");
        }
    }

    private int getBonusFor(BonusType previousFrameBonusType) {
        if (frameRolls.isEmpty()) {
            return 0;
        }
        final int bonusPoints;
        switch (previousFrameBonusType) {
            case SPARE:
                bonusPoints = getFirstThrow();
                break;
            case STRIKE:
                bonusPoints = calculateStrikeBonusPoints();
                break;
            default:
                bonusPoints = 0;
        }
        return bonusPoints;
    }

    private int calculateStrikeBonusPoints() {
        if (firstRollIsStrike() && hasNextFrame()) {
            return nextFrame.getFirstThrow() + STRIKE_ROLL_PINS;
        }
        return getFirstThrow() + getSecondThrow();
    }

    private int getBonusPointsFromNextFrame() {
        return hasNextFrame() ? nextFrame.getBonusFor(this.bonusType) : 0;
    }

    private int getFirstThrow() {
        return frameRolls.isEmpty() ? 0 : frameRolls.get(0);
    }

    private int getSecondThrow() {
        return getRollAmount() < 2 ? 0 : frameRolls.get(1);
    }

    private boolean hasNextFrame() {
        return nextFrame != null;
    }

    private boolean firstRollIsStrike() {
        return getFirstThrow() == STRIKE_ROLL_PINS;
    }

    private boolean rollLimitAchieved() {
        return getRollAmount() == FRAME_ROLL_LIMIT;
    }
}
