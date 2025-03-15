package ep35searchinsertposition;

public class SearchInsertPositionSolution {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
