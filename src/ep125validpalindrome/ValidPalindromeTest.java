package ep125validpalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidPalindromeTest {

    @Test
    void testPanama() {
        boolean result = ValidPalindromeSolution.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(result);
    }

    @Test
    void testNotPalindrome() {
        boolean result = ValidPalindromeSolution.isPalindrome("race a car");
        assertFalse(result);
    }

    @Test
    void testEmptySpace() {
        boolean result = ValidPalindromeSolution.isPalindrome(" ");
        assertTrue(result);
    }
}
