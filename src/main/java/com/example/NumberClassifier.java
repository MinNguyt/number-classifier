package com.example;

public class NumberClassifier {
    public static String classifyNumbers(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int num : arr) { // vòng lặp
            if (num > 0) { // rẽ nhánh
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        return "Positive: " + positive +
                ", Negative: " + negative +
                ", Zero: " + zero;
    }

    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
