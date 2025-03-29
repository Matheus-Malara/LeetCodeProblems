package ep9palindromenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void testPositivePalindrome() {
        Assertions.assertTrue(PalindromeNumberSolution.isPalindrome(121));
    }

    @Test
    void testNegativeNumber() {
        Assertions.assertFalse(PalindromeNumberSolution.isPalindrome(-121));
    }

    @Test
    void testNonPalindrome() {
        Assertions.assertFalse(PalindromeNumberSolution.isPalindrome(10));
    }
}
