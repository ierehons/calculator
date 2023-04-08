package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return a / (double) b;
    }
}
