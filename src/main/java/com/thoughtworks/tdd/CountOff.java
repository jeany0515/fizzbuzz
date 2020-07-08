package com.thoughtworks.tdd;

public class CountOff {
    public String count(int order) {
        if (order%3 == 0) {
            return "Fizz";
        }
        if (order%5 == 0) {
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
