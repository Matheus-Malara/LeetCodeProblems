package ep242validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testAnagramsWithSameCharacters() {
        String s = "listen";
        String t = "silent";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertTrue(result);
    }

    @Test
    void testNonAnagramsWithDifferentLengths() {
        String s = "abc";
        String t = "abcd";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertFalse(result);
    }

    @Test
    void testNonAnagramsWithSameLength() {
        String s = "apple";
        String t = "papel";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertFalse(result);
    }

    @Test
    void testEmptyStrings() {
        String s = "";
        String t = "";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertTrue(result);
    }

    @Test
    void testSingleCharacterAnagrams() {
        String s = "a";
        String t = "a";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertTrue(result);
    }

    @Test
    void testSingleCharacterNonAnagrams() {
        String s = "a";
        String t = "b";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertFalse(result);
    }

    @Test
    void testAnagramsWithMultipleOccurrences() {
        String s = "aabbcc";
        String t = "baccab";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertTrue(result);
    }

    @Test
    void testNonAnagramsWithExtraSpaces() {
        String s = "abc ";
        String t = "cab";
        boolean result = ValidAnagramSolution.isAnagram(s, t);
        assertFalse(result);
    }

    @Test
    void testAnagramsWithMixedCase() {
        String s = "Listen";
        String t = "Silent";
        boolean result = ValidAnagramSolution.isAnagram(s.toLowerCase(), t.toLowerCase());
        assertTrue(result);
    }
}