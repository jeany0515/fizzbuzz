package com.thoughtworks.tdd;

public class CountOff {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    public static final int DIVIDE_NUMBER_3 = 3;
    public static final int DIVIDE_NUMBER_5 = 5;
    public static final int DIVIDE_NUMBER_7 = 7;

    public String count(int order) {
        if (isDivideBy3(order) && isDivideBy5(order)) {
            return FIZZ + BUZZ;
        }
        if (isDivideBy3(order) && isDivideBy7(order)) {
            return FIZZ + WHIZZ;
        }
        if (isDivideBy5(order) && isDivideBy7(order)) {
            return BUZZ + WHIZZ;
        }
        if (isDivideBy3(order)) {
            return FIZZ;
        }
        if (isDivideBy5(order)) {
            return BUZZ;
        }
        if (isDivideBy7(order)) {
            return WHIZZ;
        }
        return String.valueOf(order);
    }

    private boolean isDivideBy3(int order) {
        return order% DIVIDE_NUMBER_3 == 0;
    }

    private boolean isDivideBy5(int order) {
        return order% DIVIDE_NUMBER_5 == 0;
    }

    private boolean isDivideBy7(int order) {
        return order% DIVIDE_NUMBER_7 == 0;
    }
}
