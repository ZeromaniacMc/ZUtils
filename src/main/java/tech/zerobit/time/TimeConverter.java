package tech.zerobit.time;

import java.util.concurrent.TimeUnit;

public class TimeConverter {

    public static long convert(Unit inputUnit, long input) {
        TimeUnit time = TimeUnit.MILLISECONDS;

        switch (inputUnit) {
            case MILLISECONDS:
                return time.convert(input, TimeUnit.MILLISECONDS);
            case SECONDS:
                return time.convert(input, TimeUnit.SECONDS);
            case MINUTES:
                return time.convert(input, TimeUnit.MINUTES);
            case HOURS:
                return time.convert(input, TimeUnit.HOURS);
            case DAYS:
                return time.convert(input, TimeUnit.DAYS);
            case WEEKS:
                return time.convert(input, TimeUnit.SECONDS) * 604800;
            case MONTHS:
                return time.convert(input, TimeUnit.SECONDS) * 2628000;
            case YEARS:
                return time.convert(input, TimeUnit.SECONDS) * 31536000;
        }
        return input;
    }


    private static double dynamicModulus(int input, int unitMaximum) {
        return input % unitMaximum;
    }

    private static double dynamicModulus(double input, double unitMaximum) {
        return input % unitMaximum;
    }

    private static double round(double input) {
        return Math.round(input);
    }

    private static float round(float input) {
        return Math.round(input);
    }

}
