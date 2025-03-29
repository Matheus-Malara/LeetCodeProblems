package ep136singlenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    void testExample1() {
        int result = SingleNumberSolution.singleNumber(new int[]{2, 2, 1});
        assertEquals(1, result);
    }

    @Test
    void testExample2() {
        int result = SingleNumberSolution.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, result);
    }

    @Test
    void testSingleElement() {
        int result = SingleNumberSolution.singleNumber(new int[]{1});
        assertEquals(1, result);
    }
}
