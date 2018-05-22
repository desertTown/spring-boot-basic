package com.example.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class FizzBuzzControllerTest {
    FizzBuzzController fizzBuzzController;

    @Before
    public void init() {
        fizzBuzzController = new FizzBuzzController();
    }

    @Test
    public void shouldReturnFizzWhenGiven3 () {
        int sourceNum = 3;
        String targetResult = fizzBuzzController.comparator (sourceNum);
        assertEquals("Fizz",targetResult);
    }

    @Test
    public void shouldReturnBuzzWhenGiven5 () {
        int sourceNum = 5;
        String targetResult = fizzBuzzController.comparator (sourceNum);
        assertEquals("Buzz",targetResult);
    }

    @Test
    public void shouldReturnBuzzWhenGiven15 () {
        int sourceNum = 15;
        String targetResult = fizzBuzzController.comparator (sourceNum);
        assertEquals("FizzBuzz",targetResult);
    }

    @Test
    public void shouldReturnBuzzWhenGiven4 () {
        int sourceNum = 4;
        String targetResult = fizzBuzzController.comparator (sourceNum);
        assertEquals(String.valueOf(sourceNum),targetResult);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturnBuzzWhenGivenNegativeOne () {
        int sourceNum = -1;
        String targetResult = fizzBuzzController.comparator (sourceNum);
//        assertEquals(String.valueOf(sourceNum),targetResult);
    }







}