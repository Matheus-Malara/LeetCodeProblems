package ep169majorityelement;

public class MajorityElementSolution {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int sequence = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                sequence++;
            } else {
                sequence--;
                if (sequence == -1) {
                    candidate = nums[i];
                    sequence = 1;
                }
            }
        }
        return candidate;
    }
}
