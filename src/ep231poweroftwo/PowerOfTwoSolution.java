package ep231poweroftwo;

public class PowerOfTwoSolution {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        double parametro = 1;
        while (parametro <= n) {
            if (parametro == n) {
                return true;
            }
            parametro *= 2;
        }
        return false;
    }
}
