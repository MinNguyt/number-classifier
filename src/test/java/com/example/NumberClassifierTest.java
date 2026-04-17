package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void testMixedNumbers() {
        int[] arr = {1, -2, 0};
        String result = NumberClassifier.classifyNumbers(arr);
        assertEquals("Positive: 1, Negative: 1, Zero: 1", result);
    }

    // ===== PATH COVERAGE =====

    // Path: mảng rỗng → vòng lặp không chạy lần nào
    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals("Positive: 0, Negative: 0, Zero: 0",
                     NumberClassifier.classifyNumbers(arr));
    }

    // Path: chỉ toàn số dương
    @Test
    void testAllPositive() {
        int[] arr = {1, 2, 3};
        assertEquals("Positive: 3, Negative: 0, Zero: 0",
                     NumberClassifier.classifyNumbers(arr));
    }

    // Path: chỉ toàn số âm
    @Test
    void testAllNegative() {
        int[] arr = {-1, -2, -3};
        assertEquals("Positive: 0, Negative: 3, Zero: 0",
                     NumberClassifier.classifyNumbers(arr));
    }

    // Path: chỉ toàn số 0
    @Test
    void testAllZero() {
        int[] arr = {0, 0};
        assertEquals("Positive: 0, Negative: 0, Zero: 2",
                     NumberClassifier.classifyNumbers(arr));
    }

    // Path: findMax với mảng null → exception
    @Test
    void testFindMax_throwsOnNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberClassifier.findMax(null);
        });
    }

    // Path: findMax với mảng rỗng → exception
    @Test
    void testFindMax_throwsOnEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberClassifier.findMax(new int[]{});
        });
    }

    // Path: findMax 1 phần tử
    @Test
    void testFindMax_singleElement() {
        assertEquals(7, NumberClassifier.findMax(new int[]{7}));
    }

    // Path: findMax phần tử đầu là max
    @Test
    void testFindMax_firstIsMax() {
        assertEquals(9, NumberClassifier.findMax(new int[]{9, 3, 1}));
    }

    // Path: findMax phần tử cuối là max
    @Test
    void testFindMax_lastIsMax() {
        assertEquals(9, NumberClassifier.findMax(new int[]{1, 3, 9}));
    }
}