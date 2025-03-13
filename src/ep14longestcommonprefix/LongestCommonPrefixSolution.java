package ep14longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] stringsArray) {
        if (stringsArray == null || stringsArray.length == 0) {
            return "";
        }

        Arrays.sort(stringsArray);

        String first = stringsArray[0];
        String last = stringsArray[stringsArray.length - 1];
        int index = 0;

        while (index < first.length() && index < last.length() && first.charAt(index) == last.charAt(index)) {
            index++;
        }

        return first.substring(0, index);

    }
}
