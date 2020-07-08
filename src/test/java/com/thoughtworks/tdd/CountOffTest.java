package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOffTest {
    private CountOff countOff;

    @BeforeEach
    void init() {
        countOff = new CountOff();
    }

    @Test
    public void should_return_1_when_count_off_given_order_1_in_line() {
        //given
        int order = 1;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "1");
    }

    @Test
    public void should_return_Fizz_when_count_off_given_order_3_in_line() {
        //given
        int order = 3;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "Fizz");
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_5_in_line() {
        //given
        int order = 5;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "Buzz");
    }

    @Test
    public void should_return_Whizz_when_count_off_given_order_7_in_line() {
        //given
        int order = 7;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_15_in_line() {
        //given
        int order = 15;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_count_off_given_order_21_in_line() {
        //given
        int order = 21;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_count_off_given_order_35_in_line() {
        //given
        int order = 35;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_order_105_in_line() {
        //given
        int order = 105;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_order_315_in_line() {
        //given
        int order = 315;

        //when
        String actual = countOff.count(order);

        //then
        assertEquals(actual, "FizzBuzzWhizz");
    }
}
