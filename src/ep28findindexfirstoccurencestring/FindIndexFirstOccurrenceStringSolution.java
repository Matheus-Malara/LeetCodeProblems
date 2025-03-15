package ep28findindexfirstoccurencestring;

public class FindIndexFirstOccurrenceStringSolution {
    public static int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength == 0) {
            return 0;
        }

        for (int i = 0; i <= hLength - nLength; i++) {
            int j = 0;
            while (j < nLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLength) return i;
        }

        return -1;
    }
}