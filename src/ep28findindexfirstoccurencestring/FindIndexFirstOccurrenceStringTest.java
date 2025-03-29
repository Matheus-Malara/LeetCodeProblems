package ep28findindexfirstoccurencestring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexFirstOccurrenceStringTest {

    @Test
    void testSadInButSad() {
        int result = FindIndexFirstOccurrenceStringSolution.strStr("butsad", "sad");
        assertEquals(3, result);
    }

    @Test
    void testLeetInLeetcode() {
        int result = FindIndexFirstOccurrenceStringSolution.strStr("leetcode", "leet");
        assertEquals(0, result);
    }

    @Test
    void testNotFound() {
        int result = FindIndexFirstOccurrenceStringSolution.strStr("abcde", "xyz");
        assertEquals(-1, result);
    }

    @Test
    void testNeedleIsEmpty() {
        int result = FindIndexFirstOccurrenceStringSolution.strStr("hello", "");
        assertEquals(0, result);
    }
}
