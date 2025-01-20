package org.example;
import java.util.List;
public class AverageCalculator {
    public static double calculateAverage(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Không thể tính trung bình cho một danh sách trống");
        }
        double sum = 0.0;
        for (float number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
