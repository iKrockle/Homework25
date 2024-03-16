package com.skyproHW25.Calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void Plus_success() {
        int num1 = 5;
        int num2 = 3;

        int expectedResult = num1+num2;

        int actualResult = calculatorService.getPlus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void Minus_success() {
        int num1 = 5;
        int num2 = 3;

        int expectedResult = num1-num2;

        int actualResult = calculatorService.getMinus(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void Multiply_success() {
        int num1 = 5;
        int num2 = 3;

        int expectedResult = num1*num2;

        int actualResult = calculatorService.getMultiply(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void Divide_success() {
        int num1 = 5;
        int num2 = 3;

        double expectedResult = (double) num1 /num2;

        double actualResult = calculatorService.getDivide(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void divide_withIllegalArgumentException() {
        //Подготовка входных данных
        int num1 = 9;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "Деление на 0 запрещено";

        //Начало теста
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.getDivide(num1, num2));
        assertEquals(expectedMessage, exception.getMessage());
    }
}