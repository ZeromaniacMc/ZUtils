package tech.zerobit.condition;

public class StringCondition {

    public boolean stringCondition(java.lang.String input, java.lang.String logicalOperator, java.lang.String compare) {
        // == or equals
        // != or !equals
        // contains
        // !contains

        if (logicalOperator.equals("==") || (logicalOperator.equalsIgnoreCase("equals"))) {
            return input.equalsIgnoreCase(compare);
        }

        if (logicalOperator.equals("===") || (logicalOperator.equalsIgnoreCase("equalsExact"))) {
            return input.equals(compare);
        }

        if (logicalOperator.equals("!=") || (logicalOperator.equalsIgnoreCase("!equals"))) {
            return !input.equalsIgnoreCase(compare);
        }

        if (logicalOperator.equals("!==") || (logicalOperator.equalsIgnoreCase("!equalsExact"))) {
            return !input.equals(compare);
        }

        if (logicalOperator.equalsIgnoreCase("contains")) {
            return input.toLowerCase().contains(compare.toLowerCase());
        }

        if (logicalOperator.equalsIgnoreCase("containsExact")) {
            return input.contains(compare);
        }

        if (logicalOperator.equalsIgnoreCase("!contains")) {
            return !input.toLowerCase().contains(compare.toLowerCase());
        }

        if (logicalOperator.equalsIgnoreCase("!containsExact")) {
            return !input.contains(compare);
        }

        return false;
    }
}
