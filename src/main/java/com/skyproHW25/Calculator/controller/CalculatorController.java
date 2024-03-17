package com.skyproHW25.Calculator.controller;

import com.skyproHW25.Calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showPlus(@RequestParam("num1") Integer num1
            , @RequestParam("num2") Integer num2) {
        return num1 + "+" + num2 + "=" + calculatorService.getPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam("num1") Integer num1
            , @RequestParam("num2") Integer num2) {
        return num1 + "-" + num2 + "=" + calculatorService.getMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiply(@RequestParam("num1") Integer num1
            , @RequestParam("num2") Integer num2) {
        return num1 + "*" + num2 + "=" + calculatorService.getMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam("num1") Integer num1
            , @RequestParam("num2") Integer num2) {
        return num1 + "/" + num2 + "=" + calculatorService.getDivide(num1, num2);
    }
}
