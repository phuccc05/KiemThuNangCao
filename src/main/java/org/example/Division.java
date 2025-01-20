package org.example;

public class Division {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không chia được cho 0");
        }
        return a / b;
    }
}
