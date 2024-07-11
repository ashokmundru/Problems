package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestContinuousSequenceTest {

    @Test
    void maxContinuousOnes() {
        assertEquals(4, LongestContinuousSequence.getStartPositionOfLongestSequenceOfOnes(156));
        assertEquals(3, LongestContinuousSequence.getStartPositionOfLongestSequenceOfOnes(88));
        assertEquals(-1, LongestContinuousSequence.getStartPositionOfLongestSequenceOfOnes(0));
        assertEquals(1, LongestContinuousSequence.getStartPositionOfLongestSequenceOfOnes(7));
        assertThrows(IllegalArgumentException.class, () -> LongestContinuousSequence.getStartPositionOfLongestSequenceOfOnes(-1));
    }
}