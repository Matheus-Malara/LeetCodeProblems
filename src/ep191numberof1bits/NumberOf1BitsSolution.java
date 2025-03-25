package ep191numberof1bits;

public class NumberOf1BitsSolution {
    public static int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        char[] binaryCharsArray = binaryString.toCharArray();
        int result = 0;
        for (char c : binaryCharsArray) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }
}
