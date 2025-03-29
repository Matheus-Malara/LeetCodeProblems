package ep66plusone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {

    @Test
    void testSimpleIncrement() {
        int[] result = PlusOneSolution.plusOne(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 4}, result);
    }

    @Test
    void testIncrementWithCarry() {
        int[] result = PlusOneSolution.plusOne(new int[]{4, 3, 2, 1});
        assertArrayEquals(new int[]{4, 3, 2, 2}, result);
    }

    @Test
    void testSingleNine() {
        int[] result = PlusOneSolution.plusOne(new int[]{9});
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    void testMultipleNines() {
        int[] result = PlusOneSolution.plusOne(new int[]{9, 9, 9, 9});
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, result);
    }
}
