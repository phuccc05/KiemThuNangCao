import org.example.Multiply;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MutiplyTest {
    @Test
    void testPositiveNumbers() {
        assertEquals(15, Multiply.multiply(3, 5));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(15, Multiply.multiply(-3, -5));
    }

    @Test
    void testPositiveAndNegative() {
        assertEquals(-15, Multiply.multiply(3, -5));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0, Multiply.multiply(0, 5));
    }

    @Test
    void testBothZero() {
        assertEquals(0, Multiply.multiply(0, 0));
    }

    @Test
    void testLargeIntegers() {
        assertEquals(1_000_000_000, Multiply.multiply(1_000, 1_000_000));
    }
}
