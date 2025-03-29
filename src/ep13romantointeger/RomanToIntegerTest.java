package ep13romantointeger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    void testIII() {
        int result = RomanToIntegerSolution.romanToInt("III");
        assertEquals(3, result);
    }

    @Test
    void testLVIII() {
        int result = RomanToIntegerSolution.romanToInt("LVIII");
        assertEquals(58, result);
    }

    @Test
    void testMCMXCIV() {
        int result = RomanToIntegerSolution.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }
}
