package com.example.taskmanager.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mathcalculator")
public class CalculationService {
    @GetMapping("/addition")
    public int addition(@RequestParam int first, @RequestParam int second) {return first + second;}

    @GetMapping("/substraction")
    public int subtraction(@RequestParam int first, @RequestParam int second) {
        return first - second;
    }
    @GetMapping("multiplication")
    public int multiplication(@RequestParam int first, @RequestParam int second) {
        return first * second;
    }
    @GetMapping("/division")
    public double divide(@RequestParam int first, @RequestParam int second) {
        if (second == 0) throw new ArithmeticException("Division by zero");
        return (double) first / second;
    }
}
