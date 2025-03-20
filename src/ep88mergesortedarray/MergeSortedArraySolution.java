package ep88mergesortedarray;

public class MergeSortedArraySolution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = m - 1;
        int indexNums2 = n - 1;
        int totalNums1 = m + n - 1;

        while (indexNums1 >= 0 && indexNums2 >= 0) {
            if (nums1[indexNums1] > nums2[indexNums2]) {
                nums1[totalNums1--] = nums1[indexNums1--];
            } else {
                nums1[totalNums1--] = nums2[indexNums2--];
            }
        }

        while (indexNums2 >= 0) {
            nums1[totalNums1--] = nums2[indexNums2--];
        }
    }
}
