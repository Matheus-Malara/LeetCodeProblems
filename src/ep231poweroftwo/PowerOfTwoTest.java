package ep231poweroftwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    void testIsPowerOfTwoWithPositivePowerOfTwo() {
        int input = 16;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertTrue(result);
    }

    @Test
    void testIsPowerOfTwoWithNegativeNumber() {
        int input = -8;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertFalse(result);
    }

    @Test
    void testIsPowerOfTwoWithZero() {
        int input = 0;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertFalse(result);
    }

    @Test
    void testIsPowerOfTwoWithOne() {
        int input = 1;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertTrue(result);
    }

    @Test
    void testIsPowerOfTwoWithNonPowerOfTwo() {
        int input = 18;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertFalse(result);
    }

    @Test
    void testIsPowerOfTwoWithVeryLargePowerOfTwo() {
        int input = 1073741824;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertTrue(result);
    }

    @Test
    void testIsPowerOfTwoWithLargeNonPowerOfTwo() {
        int input = 123456789;
        boolean result = PowerOfTwoSolution.isPowerOfTwo(input);
        assertFalse(result);
    }
}