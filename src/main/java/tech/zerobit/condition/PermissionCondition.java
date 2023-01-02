package tech.zerobit.condition;

import org.bukkit.entity.Player;

public class PermissionCondition {
    public boolean permissionCondition(Player player, String[] input, String logicalOperator, boolean compare) {
        // operator "and" ,"or"
        // compare true/ false

        if (logicalOperator.equalsIgnoreCase("and")) {
            for (String perm : input) {
                if (player.hasPermission(perm) != compare) {
                    return false;
                }
            }
        } else if (logicalOperator.equalsIgnoreCase("or")) {
            for (String perm : input) {
                if (player.hasPermission(perm) == compare) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
