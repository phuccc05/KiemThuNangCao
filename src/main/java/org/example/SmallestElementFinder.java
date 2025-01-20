package org.example;
import java.util.List;

public class SmallestElementFinder {
    public static int findSmallest(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("mảng không được trống");
        }

        int smallest = numbers.get(0);
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
