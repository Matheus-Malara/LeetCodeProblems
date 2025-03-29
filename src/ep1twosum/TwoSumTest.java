package ep1twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = TwoSumSolution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = TwoSumSolution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = TwoSumSolution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }
}