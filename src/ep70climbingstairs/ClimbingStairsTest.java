package ep70climbingstairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    @Test
    void testClimb3Steps() {
        int result = ClimbingStairsSolution.climbStairs(3);
        assertEquals(3, result);
    }

    @Test
    void testClimb5Steps() {
        int result = ClimbingStairsSolution.climbStairs(5);
        assertEquals(8, result);
    }

    @Test
    void testClimb10Steps() {
        int result = ClimbingStairsSolution.climbStairs(10);
        assertEquals(89, result);
    }

    @Test
    void testClimb21Steps() {
        int result = ClimbingStairsSolution.climbStairs(21);
        assertEquals(17711, result);
    }
}
