import org.example.AverageCalculator;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {
    @Test
    void testCalculateAverageWithValidList() {
        assertEquals(3.3, AverageCalculator.calculateAverage(Arrays.asList(1.1f, 2.2f, 6.6f)), 0.0001);
    }

    @Test
    void testCalculateAverageWithEmptyList() {
        assertThrows(ArithmeticException.class, () -> AverageCalculator.calculateAverage(Collections.emptyList()));
    }

    @Test
    void testCalculateAverageWithNullList() {
        assertThrows(ArithmeticException.class, () -> AverageCalculator.calculateAverage(null));
    }

    @Test
    void testCalculateAverageWithSingleElement() {
        assertEquals(10.5, AverageCalculator.calculateAverage(Collections.singletonList(10.5f)), 0.0001);
    }

    @Test
    void testCalculateAverageWithNegativeNumbers() {
        assertEquals(-3.5, AverageCalculator.calculateAverage(Arrays.asList(-1.5f, -2.5f, -6.5f, -3.5f)), 0.0001);
    }

    @Test
    void testCalculateAverageWithMixedNumbers() {
        assertEquals(0.0, AverageCalculator.calculateAverage(Arrays.asList(-1.0f, 1.0f)), 0.0001);
    }
}
