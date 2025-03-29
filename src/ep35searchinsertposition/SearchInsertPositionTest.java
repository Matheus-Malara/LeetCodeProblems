package ep35searchinsertposition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    @Test
    void testTargetExists() {
        int result = SearchInsertPositionSolution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, result);
    }

    @Test
    void testInsertBefore() {
        int result = SearchInsertPositionSolution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, result);
    }

    @Test
    void testInsertAtEnd() {
        int result = SearchInsertPositionSolution.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, result);
    }

    @Test
    void testInsertAtStart() {
        int result = SearchInsertPositionSolution.searchInsert(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0, result);
    }

    @Test
    void testEmptyArray() {
        int result = SearchInsertPositionSolution.searchInsert(new int[]{}, 3);
        assertEquals(0, result);
    }
}
