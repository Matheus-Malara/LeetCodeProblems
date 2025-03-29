package ep26removeduplicatesfromsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testExample1() {
        int[] nums = {1, 1, 2};
        int result = RemoveDuplicateFromSortedArraySolution.removeDuplicates(nums);
        assertEquals(2, result);
    }

    @Test
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = RemoveDuplicateFromSortedArraySolution.removeDuplicates(nums);
        assertEquals(5, result);
    }

    @Test
    void testExample3() {
        int[] nums = {0, 1, 1, 2, 3, 3, 4, 5, 6, 6};
        int result = RemoveDuplicateFromSortedArraySolution.removeDuplicates(nums);
        assertEquals(7, result);
    }
}
