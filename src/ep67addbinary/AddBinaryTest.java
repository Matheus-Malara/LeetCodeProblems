package ep67addbinary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    @Test
    void testExample1() {
        String result = AddBinarySolution.addBinary("1010", "1011");
        assertEquals("10101", result);
    }

    @Test
    void testExample2() {
        String result = AddBinarySolution.addBinary("1101", "101");
        assertEquals("10010", result);
    }

    @Test
    void testExample3() {
        String result = AddBinarySolution.addBinary("11", "101010");
        assertEquals("101101", result);
    }

    @Test
    void testExample4() {
        String result = AddBinarySolution.addBinary("110111", "10110");
        assertEquals("1001101", result);
    }
}
