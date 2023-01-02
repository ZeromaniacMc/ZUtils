package tech.zerobit.validate;

public class StringValidator {

    public static boolean isStringNotEmptyAndNotNull(String input) {
        if (!isStringEmpty(input) && !isStringNull(input)) {
            return true;
        }
        else return false;
    }

    public static boolean isStringEmpty(String input) {
        return input.isEmpty();
    }

    public static boolean isStringNull(String input) {
        return input == null;
    }
}
