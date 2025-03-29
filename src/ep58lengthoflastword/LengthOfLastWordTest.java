package ep58lengthoflastword;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {

    @Test
    void testHelloWorld() {
        int result = LenghtOfLastWordSolution.lengthOfLastWord("Hello World");
        assertEquals(5, result);
    }

    @Test
    void testWithExtraSpaces() {
        int result = LenghtOfLastWordSolution.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, result);
    }

    @Test
    void testJoyboyPhrase() {
        int result = LenghtOfLastWordSolution.lengthOfLastWord("luffy is still joyboy");
        assertEquals(6, result);
    }

    @Test
    void testSingleWordWithSpaces() {
        int result = LenghtOfLastWordSolution.lengthOfLastWord("   word   ");
        assertEquals(4, result);
    }
}
