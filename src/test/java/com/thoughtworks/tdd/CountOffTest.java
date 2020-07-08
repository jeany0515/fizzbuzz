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
}
