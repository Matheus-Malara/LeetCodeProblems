package ep191numberof1bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {

    @Test
    void testHammingWeight15() {
        int result = NumberOf1BitsSolution.hammingWeight(15);
        assertEquals(4, result);
    }

    @Test
    void testHammingWeight11() {
        int result = NumberOf1BitsSolution.hammingWeight(11);
        assertEquals(3, result);
    }

    @Test
    void testHammingWeight128() {
        int result = NumberOf1BitsSolution.hammingWeight(128);
        assertEquals(1, result);
    }

    @Test
    void testHammingWeightMax() {
        int result = NumberOf1BitsSolution.hammingWeight(2147483645);
        assertEquals(30, result);
    }
}
