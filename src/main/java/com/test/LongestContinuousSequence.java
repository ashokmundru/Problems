package com.test;

public class LongestContinuousSequence {
    public static int getStartPositionOfLongestSequenceOfOnes(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        String binaryRepresentation = Integer.toBinaryString(number);
        return findStartPosition(binaryRepresentation);
    }

    private static int findStartPosition(String binaryRepresentation) {
        int longestSequenceLength = 0;
        int currentSequenceLength = 0;
        int startPositionOfLongestSequence = -1;

        for (int index = binaryRepresentation.length() - 1; index >= 0; index--) {
            if (!isBitOne(binaryRepresentation, index)) {
                currentSequenceLength = 0;
                continue;
            }

            currentSequenceLength++;
            if (currentSequenceLength > longestSequenceLength) {
                longestSequenceLength = currentSequenceLength;
                startPositionOfLongestSequence = index + 1;
            }
        }
        return startPositionOfLongestSequence;
    }

    private static boolean isBitOne(String binaryRepresentation, int index) {
        return binaryRepresentation.charAt(index) == '1';
    }
}
