package com.test;

public class WordFinder {
    public static String findWordWithMostOccurences(String statement, char letter) {
        String[] words = statement.split("\\s+");
        String result = "";
        int maxOccurrencesOfCharacter = 0;
        int maxLengthOfWord = 0;

        for (String word : words) {
            int count = countOccurences(word, letter);
            if (count > maxOccurrencesOfCharacter ||
                    (count == maxOccurrencesOfCharacter && word.length() > maxLengthOfWord)) {
                maxOccurrencesOfCharacter = count;
                maxLengthOfWord = word.length();
                result = word;
            }
        }

        return maxOccurrencesOfCharacter == 0 ? "" : result;
    }

    private static int countOccurences(String word, char letter) {
        int count = 0;
        for (char character : word.toCharArray()) {
            if (character == letter) {
                count++;
            }
        }
        return count;
    }
}