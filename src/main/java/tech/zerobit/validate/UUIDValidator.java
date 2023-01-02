package tech.zerobit.validate;

import java.util.regex.Pattern;

public class UUIDValidator {

    public static boolean isValidUUID(String uuid) {
        if(StringValidator.isStringNotEmptyAndNotNull(uuid)) {
            Pattern pattern = Pattern.compile("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}");
            return pattern.matcher(uuid).matches();
        }
        return false;
    }
}
