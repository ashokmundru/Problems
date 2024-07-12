package com.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordFinderTest {
    @Test
    void findWordWithMostOccurencesWithOnlyLetterExistingWord() {
        assertEquals("crazy", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'z'));
    }

    @Test
    void findWordWithMostOccurencesWithCaseSensitiveWord() {
        assertEquals("I", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'I'));
    }

    @Test
    void findWordWithMostOccurencesWithMoreThanOneWord() {
        assertEquals("sentence", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'e'));
    }

    @Test
    void findWordWithMostOccurencesWithNull() {
        assertEquals("", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'x'));

    }

}