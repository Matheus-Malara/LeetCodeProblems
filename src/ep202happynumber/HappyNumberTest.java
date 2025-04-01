package ep202happynumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void testIsHappy_whenNumberIsHappy_shouldReturnTrue() {
        int input = 19;
        boolean result = HappyNumberSolution.isHappy(input);
        assertTrue(result, "Expected number 19 to be a happy number.");
    }

    @Test
    void testIsHappy_whenNumberIsNotHappy_shouldReturnFalse() {
        int input = 20;
        boolean result = HappyNumberSolution.isHappy(input);
        assertFalse(result, "Expected number 20 not to be a happy number.");
    }

    @Test
    void testIsHappy_whenNumberIsOne_shouldReturnTrue() {
        int input = 1;
        boolean result = HappyNumberSolution.isHappy(input);
        assertTrue(result, "Expected number 1 to be a happy number.");
    }

    @Test
    void testIsHappy_whenNumberIsNegative_shouldReturnFalse() {
        int input = -19;
        boolean result = HappyNumberSolution.isHappy(input);
        assertFalse(result, "Expected negative numbers not to be happy numbers.");
    }

    @Test
    void testIsHappy_whenNumberIsZero_shouldReturnFalse() {
        int input = 0;
        boolean result = HappyNumberSolution.isHappy(input);
        assertFalse(result, "Expected zero not to be a happy number.");
    }

    @Test
    void testIsHappy_whenNumberHasRepeatingCycle_shouldReturnFalse() {
        int input = 4;
        boolean result = HappyNumberSolution.isHappy(input);
        assertFalse(result, "Expected number 4 to enter a repeating cycle and not be a happy number.");
    }
}