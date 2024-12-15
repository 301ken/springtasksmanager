package com.example.taskmanager.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stringsmanip")
public class StringManipulationController {
    @GetMapping("/reversedstring")
    public String reversedstring(@RequestParam String input){
        return new StringBuilder(input).reverse().toString();
    }

    @GetMapping("/vowels")
    public int vowels(@RequestParam String input){
        return (int) input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    @GetMapping("/upperstring")
    public String upperstring(@RequestParam String input){
        return input.toUpperCase();
    }
}