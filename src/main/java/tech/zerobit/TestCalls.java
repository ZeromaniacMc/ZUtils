package tech.zerobit;

import tech.zerobit.time.TimeConverter;

public class TestCalls {

    public static void main(String[] args) {
        System.out.println(TimeConverter.convert("days", 8));
        System.out.println(TimeConverter.convert("weeks", 8));
        System.out.println(TimeConverter.convert("months", 8));
        System.out.println(TimeConverter.convert("years", 8));
    }

}
