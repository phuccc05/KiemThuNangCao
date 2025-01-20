import org.example.Division;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiviosionTest {
    @Test
    void testPositiveNumbers() {
        assertEquals(2, Division.divide(10, 5));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(2, Division.divide(-10, -5));
    }

    @Test
    void testPositiveAndNegative() {
        assertEquals(-2, Division.divide(10, -5));
    }

    @Test
    void testDivideByOne() {
        assertEquals(10, Division.divide(10, 1));
    }

    @Test
    void testDivideZeroByNumber() {
        assertEquals(0, Division.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Division.divide(10, 0));
    }

    @Test
    void testResultIsZero() {
        assertEquals(0, Division.divide(1, 5));
    }

    @Test
    void testDivideByLargeNumber() {
        assertEquals(0, Division.divide(10, 1000));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(1, Division.divide(1_000_000, 1_000_000));
    }

    @Test
    void testEdgeCaseMinMaxValues() {
        assertEquals(-1, Division.divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
