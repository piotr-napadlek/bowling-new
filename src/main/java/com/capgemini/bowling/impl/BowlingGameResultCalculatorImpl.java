package com.capgemini.bowling.impl;

import com.capgemini.bowling.api.BowlingGameResultCalculator;

import java.util.ArrayList;
import java.util.List;

public class BowlingGameResultCalculatorImpl implements BowlingGameResultCalculator {
    private static final int MAX_FRAMES = 10;

    private List<Frame> frames = new ArrayList<>();

    public BowlingGameResultCalculatorImpl() {
        frames.add(new Frame());
    }

    public int roll(int numberOfPins) {
        validateRoll();
        Frame currentFrame = lastFrame();
        currentFrame.acceptRoll(numberOfPins);
        if (shouldProceedToNextFrame(currentFrame)) {
            openNewFrame(currentFrame);
        }
        return numberOfPins;
    }

    public int score() {
        return frames.stream().mapToInt(Frame::getTotalFrameScore).sum();
    }

    public boolean isFinished() {
        return frames.size() == MAX_FRAMES && lastFrame().isFrameClosed();
    }

    private boolean shouldProceedToNextFrame(Frame currentFrame) {
        return !isFinished() && currentFrame.isFrameClosed();
    }

    private void validateRoll() {
        if (isFinished()) {
            throw new IllegalStateException("Game is finished!");
        }
    }

    private void openNewFrame(Frame currentFrame) {
        Frame nextFrame = createNewFrame();
        currentFrame.setNextFrame(nextFrame);
        frames.add(nextFrame);
    }

    private Frame createNewFrame() {
        return frames.size() < (MAX_FRAMES - 1) ? new Frame() : new FinalFrame();
    }

    private Frame lastFrame() {
        return frames.get(frames.size() - 1);
    }
}
