package tech.zerobit;

import tech.zerobit.time.TimeConverter;
import tech.zerobit.time.Unit;

public class TestCalls {

    public static void main(String[] args) {
        System.out.println(TimeConverter.convertToMS(Unit.DAYS, 8));
    }

}
