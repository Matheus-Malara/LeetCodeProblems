package ep88mergesortedarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArraySolution.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        MergeSortedArraySolution.merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        MergeSortedArraySolution.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}