import org.example.ArrayElementRetriever;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayElementRetrieverTest {
    @Test
    void testGetElementAtIndexWithValidIndex() {
        assertEquals(3, ArrayElementRetriever.getElementAtIndex(Arrays.asList(1, 2, 3, 4, 5), 2));
    }

    @Test
    void testGetElementAtIndexWithFirstElement() {
        assertEquals(1, ArrayElementRetriever.getElementAtIndex(Arrays.asList(1, 2, 3, 4, 5), 0));
    }

    @Test
    void testGetElementAtIndexWithLastElement() {
        assertEquals(5, ArrayElementRetriever.getElementAtIndex(Arrays.asList(1, 2, 3, 4, 5), 4));
    }

    @Test
    void testGetElementAtIndexWithNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> ArrayElementRetriever.getElementAtIndex(Arrays.asList(1, 2, 3, 4, 5), -1));
    }

    @Test
    void testGetElementAtIndexWithIndexOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> ArrayElementRetriever.getElementAtIndex(Arrays.asList(1, 2, 3, 4, 5), 5));
    }

    @Test
    void testGetElementAtIndexWithNullList() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayElementRetriever.getElementAtIndex(null, 0));
    }

    @Test
    void testGetElementAtIndexWithEmptyList() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> ArrayElementRetriever.getElementAtIndex(Collections.emptyList(), 0));
    }
}
