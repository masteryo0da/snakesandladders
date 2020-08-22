package com.avinash.snakesandladder.utils;

import java.util.Random;

public class RandomNumberGenerator {
    private final int limit;
    private final Random random;

    public RandomNumberGenerator(int limit) {
        this.limit = limit;
        this.random = new Random();
    }

    public int generate() {
        return this.random.nextInt(limit) + 1;
    }
}
