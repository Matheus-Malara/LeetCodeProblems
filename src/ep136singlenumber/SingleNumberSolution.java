package ep136singlenumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberSolution {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> mapaValores = new HashMap<>();

        for (int num : nums) {
            mapaValores.merge(num, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : mapaValores.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}