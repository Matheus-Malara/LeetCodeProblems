package ep169majorityelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    void testExample1() {
        int result = MajorityElementSolution.majorityElement(new int[]{3, 2, 3});
        assertEquals(3, result);
    }

    @Test
    void testExample2() {
        int result = MajorityElementSolution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, result);
    }

    @Test
    void testExample3() {
        int result = MajorityElementSolution.majorityElement(new int[]{3, 2, 3, 2, 1, 1, 1});
        assertEquals(1, result);
    }
}
