package tech.zerobit.time;

import java.util.concurrent.TimeUnit;

public class TimeConverter {

    public static long convert(String inputUnit, long input) {
        inputUnit.toLowerCase();
        TimeUnit time = TimeUnit.MILLISECONDS;

        switch (inputUnit) {
            case "milliseconds":
                return time.convert(input, TimeUnit.MILLISECONDS);
            case "seconds":
                return time.convert(input, TimeUnit.SECONDS);
            case "minutes":
                return time.convert(input, TimeUnit.MINUTES);
            case "hours":
                return time.convert(input, TimeUnit.HOURS);
            case "days":
                return time.convert(input, TimeUnit.DAYS);
            case "weeks":
                return time.convert(input, TimeUnit.SECONDS) * 604800;
            case "months":
                return time.convert(input, TimeUnit.SECONDS) * 2628000;
            case "years":
                return time.convert(input, TimeUnit.SECONDS) * 31536000;
        }
        return input;
    }

    private static int yearsToMonths(int years) {
        return years * 12;
    }

    private static int yearsToDays(int years) {
        return years * 365;
    }

    private static int yearsToWeeks(int years) {
        return years * 52;
    }

    // todo: make exact calc for this
    private static double monthsToDaysEstimate(int months) {
        return months * 30.436875;
    }

    private static int daysToHours(int days) {
        return days * 24;
    }

    private static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    private static int minutesToSeconds(int minutes) {
        return minutes * 60;
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
