package ep69sqrtx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtxTest {

    @Test
    void testSqrtOf9() {
        int result = SqrtxSolution.mySqrt(9);
        assertEquals(3, result);
    }

    @Test
    void testSqrtOf18() {
        int result = SqrtxSolution.mySqrt(18);
        assertEquals(4, result);
    }

    @Test
    void testSqrtOf27() {
        int result = SqrtxSolution.mySqrt(27);
        assertEquals(5, result);
    }

    @Test
    void testSqrtOf55() {
        int result = SqrtxSolution.mySqrt(55);
        assertEquals(7, result);
    }
}
