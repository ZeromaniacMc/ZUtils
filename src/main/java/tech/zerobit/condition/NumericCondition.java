package tech.zerobit.condition;

public class NumericCondition {

    public boolean numericCondition(String input, String logicalOperator, double compare) {
        // <, <=, >, >=, ==

        if (logicalOperator.equals("<") || logicalOperator.equalsIgnoreCase("smallerThan")) {
            try {
                return Double.valueOf(input) < compare;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (logicalOperator.equals("<=") || logicalOperator.equalsIgnoreCase("smallerOrEqual")) {
            try {
                return Double.valueOf(input) <= compare;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (logicalOperator.equals(">") || logicalOperator.equalsIgnoreCase("biggerThan")) {
            try {
                return Double.valueOf(input) > compare;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (logicalOperator.equals(">=") || logicalOperator.equalsIgnoreCase("biggerOrEqual")) {
            try {
                return Double.valueOf(input) >= compare;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (logicalOperator.equals("==") || logicalOperator.equalsIgnoreCase("equals")) {
            try {
                return Double.valueOf(input) == compare;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
