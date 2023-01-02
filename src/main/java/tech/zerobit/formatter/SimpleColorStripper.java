package tech.zerobit.formatter;

import tech.zerobit.validate.StringValidator;

public class SimpleColorStripper {

    public static String stripColorBukkitSymbol(String input) {
        if (StringValidator.isStringNotEmptyAndNotNull(input)) {
            return input.replaceAll("\u00a7[0-9A-Fa-fk-orx]", "");
        }
        return input;
    }

    public static String stripColorAndSymbol(String input) {
        if (StringValidator.isStringNotEmptyAndNotNull(input)) {
            return input.replaceAll("&[0-9A-Fa-fk-orx]", "");
        }
        return input;
    }
}
