package ep20validparentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidParenthesesTest {

    @Test
    void testSimpleValid() {
        boolean result = ValidParenthesesSolution.isValid("()");
        assertTrue(result);
    }

    @Test
    void testMixedValid() {
        boolean result = ValidParenthesesSolution.isValid("()[]{}");
        assertTrue(result);
    }

    @Test
    void testInvalidCloseMismatch() {
        boolean result = ValidParenthesesSolution.isValid("(]");
        assertFalse(result);
    }

    @Test
    void testNestedValid() {
        boolean result = ValidParenthesesSolution.isValid("([])");
        assertTrue(result);
    }
}
