package p1twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapaValores = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int valorFaltante = target - nums[i];

            if (mapaValores.containsKey(valorFaltante)) {
                return new int[]{mapaValores.get(valorFaltante), i};
            }

            mapaValores.put(nums[i], i);
        }

        return new int[]{};
    }
}
