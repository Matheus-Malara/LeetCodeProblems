package ep9palindromenumber;

public class PalindromeNumberSolution {
    public static boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        String numberString = Integer.toString(number);
        return numberString.contentEquals(new StringBuilder(numberString).reverse());
    }
}
