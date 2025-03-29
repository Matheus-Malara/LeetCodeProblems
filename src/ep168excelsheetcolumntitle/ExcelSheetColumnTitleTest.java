package ep168excelsheetcolumntitle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnTitleTest {

    @Test
    void testConvert1() {
        String result = ExcelSheetColumnTitleSolution.convertToTitle(1);
        assertEquals("A", result);
    }

    @Test
    void testConvert28() {
        String result = ExcelSheetColumnTitleSolution.convertToTitle(28);
        assertEquals("AB", result);
    }

    @Test
    void testConvert701() {
        String result = ExcelSheetColumnTitleSolution.convertToTitle(701);
        assertEquals("ZY", result);
    }

    @Test
    void testConvert123() {
        String result = ExcelSheetColumnTitleSolution.convertToTitle(123);
        assertEquals("DS", result);
    }
}
