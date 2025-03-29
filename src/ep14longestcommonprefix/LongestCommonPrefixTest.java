package ep14longestcommonprefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    void testExample1() {
        String[] input = {"flower", "flow", "flight"};
        String result = LongestCommonPrefixSolution.longestCommonPrefix(input);
        assertEquals("fl", result);
    }

    @Test
    void testExample2() {
        String[] input = {"dog", "racecar", "car"};
        String result = LongestCommonPrefixSolution.longestCommonPrefix(input);
        assertEquals("", result);
    }

    @Test
    void testExample3() {
        String[] input = {"Triumph", "Trick", "Triangle", "Trivial", "Trio", "Trip"};
        String result = LongestCommonPrefixSolution.longestCommonPrefix(input);
        assertEquals("Tri", result);
    }
}
