package ep88mergesortedarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    void testMergeStandard() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArraySolution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testMergeWithEmptyNums2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        MergeSortedArraySolution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMergeWithEmptyNums1() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        MergeSortedArraySolution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }
}
