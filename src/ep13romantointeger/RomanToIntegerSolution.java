package ep13romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanos = new HashMap<>();
        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (char letra : s.toCharArray()) {
            int num = romanos.get(letra);
            if (num > prev) {
                total = total + num - 2 * prev;
            } else {
                total = total + num;
            }
            prev = num;
        }
        return total;
    }
}
