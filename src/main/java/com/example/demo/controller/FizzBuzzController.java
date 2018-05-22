package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FizzBuzzController {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz" ;

    public String comparator(int num) {
        if (num%3 == 0 && num%5 !=0) {
            return FIZZ;
        } else if (num%3 !=0 &&num%5 ==0) {
            return BUZZ;
        }else if (num%3 == 0 && num%5 ==0) {
            return FIZZBUZZ;
        } else if (num < 0) {
            throw new RuntimeException("input error");
        }  else {
            return String.valueOf(num);
        }
    }
}
