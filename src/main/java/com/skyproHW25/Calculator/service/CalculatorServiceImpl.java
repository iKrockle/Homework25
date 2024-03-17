package com.skyproHW25.Calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int getPlus(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double getDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 запрещено");
        } else {
            return (double) num1 / num2;
        }
    }
}
