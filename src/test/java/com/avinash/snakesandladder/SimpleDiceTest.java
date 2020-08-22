package com.avinash.snakesandladder;

import com.avinash.snakesandladder.utils.RandomNumberGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SimpleDiceTest {
    private RandomNumberGenerator numberGenerator;
    private Dice dice;

    @BeforeEach
    public void setUp() {
        numberGenerator = mock(RandomNumberGenerator.class);
        dice = new SimpleDice(numberGenerator);
    }
    @Test
    public void testRollWithNoSix() {
        when(numberGenerator.generate()).thenReturn(5);
        assertEquals(5, dice.roll());
    }

    @Test
    public void testRollWithOneSix() {
        when(numberGenerator.generate()).thenReturn(6).thenReturn(5);
        assertEquals(11, dice.roll());
    }

    @Test
    public void testRollWithTwoSixes() {
        when(numberGenerator.generate()).thenReturn(6).thenReturn(6).thenReturn(5);
        assertEquals(17, dice.roll());
    }

    @Test
    public void testRollWithThreeSixes() {
        when(numberGenerator.generate()).thenReturn(6).thenReturn(6).thenReturn(6);
        assertEquals(12, dice.roll());
    }
}