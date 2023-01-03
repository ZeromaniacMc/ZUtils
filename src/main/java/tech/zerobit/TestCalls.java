package tech.zerobit;

import tech.zerobit.formatter.Beautifier;
import tech.zerobit.time.TimeConverter;
import tech.zerobit.validate.UUIDValidator;

public class TestCalls {

    public static void main(String[] args) {
        System.out.println(Beautifier.replaceUnderscoresWithSpaces("world_the_end"));
        System.out.println(Beautifier.capitalizeAllWords(""));
        System.out.println(UUIDValidator.isValidUUID("4db79777-69d4-455d-a9ba-c1c96d225df5"));
        System.out.println(TimeConverter.convertSingleUnitByName(5,"years", "months"));
    }

}
