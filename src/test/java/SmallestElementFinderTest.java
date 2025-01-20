import org.example.AverageCalculator;
import org.example.SmallestElementFinder;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class SmallestElementFinderTest {
    @Test
    void testFindSmallestWithValidList() {
        assertEquals(1, SmallestElementFinder.findSmallest(Arrays.asList(5, 3, 8, 1, 6)));
    }

    @Test
    void testFindSmallestWithNegativeNumbers() {
        assertEquals(-8, SmallestElementFinder.findSmallest(Arrays.asList(-3, -1, -8, -2)));
    }

    @Test
    void testFindSmallestWithSingleElement() {
        assertEquals(42, SmallestElementFinder.findSmallest(Collections.singletonList(42)));
    }

    @Test
    void testFindSmallestWithDuplicateNumbers() {
        assertEquals(2, SmallestElementFinder.findSmallest(Arrays.asList(2, 2, 3, 4, 2)));
    }

    @Test
    void testFindSmallestWithEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> SmallestElementFinder.findSmallest(Collections.emptyList()));
    }

    @Test
    void testFindSmallestWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> SmallestElementFinder.findSmallest(null));
    }
}
