package com.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordFinderTest {
    @Test
    void findWordWithMostOccurences() {
        assertEquals("crazy", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'z'));
        assertEquals("I", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'I'));
        assertEquals("sentence", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'e'));
        assertEquals("", WordFinder.findWordWithMostOccurences("This is a very long sentence and I want to educate everyone in this whole crazy world...", 'x'));

    }
}