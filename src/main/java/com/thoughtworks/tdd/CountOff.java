package com.thoughtworks.tdd;

public class CountOff {
    public String count(int order) {
        if (order%3 == 0) {
            return "Fizz";
        }
        return String.valueOf(order);
    }
}
