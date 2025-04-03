package ep242validanagram;

import java.util.Arrays;

public class ValidAnagramSolution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        for (int i = 0; i < string1.length; i++) {
            if (string1[i] != string2[i]) return false;
        }
        return true;
    }
}
