package com.thoughtworks.tdd;

public class CountOff {
    public String count(int order) {
        if (isDivideBy3(order)) {
            return "Fizz";
        }
        if (isDivideBy5(order)) {
            return "Buzz";
        }
        if (isDivideBy7(order)) {
            return "Whizz";
        }
        return String.valueOf(order);
    }

    private boolean isDivideBy3(int order) {
        return order%3 == 0;
    }

    private boolean isDivideBy5(int order) {
        return order%5 == 0;
    }

    private boolean isDivideBy7(int order) {
        return order%7 == 0;
    }
}
