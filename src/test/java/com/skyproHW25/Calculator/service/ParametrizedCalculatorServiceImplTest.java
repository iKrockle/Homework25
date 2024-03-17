package com.skyproHW25.Calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizedCalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> plusParams() {

        return Stream.of(
                Arguments.of(2, 2, 2 + 2),
                Arguments.of(45, 4, 45 + 4),
                Arguments.of(38, 1, 38 + 1),
                Arguments.of(0, 0, 0 + 0)
        );
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(2, 2, 2 - 2),
                Arguments.of(45, 4, 45 - 4),
                Arguments.of(38, 1, 38 - 1),
                Arguments.of(0, 0, 0 - 0)
        );
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2, 2, 2 * 2),
                Arguments.of(5, 4, 5 * 4),
                Arguments.of(38, 1, 38 * 1),
                Arguments.of(0, 0, 0 * 0)
        );
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(2, 2, (double) 2 / 2),
                Arguments.of(5, 4, (double) 5 / 4),
                Arguments.of(38, 1, (double) 38 / 1),
                Arguments.of(0, 1, (double) 0 / 1)
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getPlus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getMinus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getMultiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, double result) {
        assertEquals(result, calculatorService.getDivide(num1, num2));
    }
}