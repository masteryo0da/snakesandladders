package com.avinash.snakesandladder;

import com.avinash.snakesandladder.utils.RandomNumberGenerator;

public class SimpleDice implements Dice {
    private final RandomNumberGenerator numberGenerator;

    public SimpleDice(RandomNumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public int roll() {
        int sixCount = 0;
        int rollValue = 0;
        while (true) {
            int number = numberGenerator.generate();
            if (number != 6) {
                rollValue += number;
                break;
            } else if (sixCount < 2) {
                rollValue += number;
                sixCount++;
            } else
                break;
        }
        return rollValue;
    }
}
