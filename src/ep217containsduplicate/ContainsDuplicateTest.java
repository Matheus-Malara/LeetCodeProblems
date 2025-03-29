package ep217containsduplicate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContainsDuplicateTest {

    @Test
    void testWithDuplicateAtEnds() {
        boolean result = ContainsDuplicateSolution.containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(result);
    }

    @Test
    void testWithoutDuplicate() {
        boolean result = ContainsDuplicateSolution.containsDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(result);
    }

    @Test
    void testMultipleDuplicates() {
        boolean result = ContainsDuplicateSolution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(result);
    }

    @Test
    void testRepeatedDuplicate() {
        boolean result = ContainsDuplicateSolution.containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(result);
    }
}
