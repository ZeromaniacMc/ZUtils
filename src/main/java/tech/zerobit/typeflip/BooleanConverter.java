package tech.zerobit.typeflip;

public class BooleanConverter {

    public String booleanToStringLiteral(boolean input) {
        if (input) {
            return "true";
        }
        else return "false";
    }

    public int booleanToInteger(boolean input) {
        if (input) {
            return 1;
        }
        else return 0;
    }
}
