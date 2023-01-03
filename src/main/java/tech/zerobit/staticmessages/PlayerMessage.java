package tech.zerobit.staticmessages;

import org.bukkit.entity.Player;
import tech.zerobit.formatter.Beautifier;

public class PlayerMessage {

    private static String pluginInfoPrefix = "&7[&3ZUtils Info&7]&3 ";
    private static String pluginWarnPrefix = "&7[&cZUtils Warning&7]&c ";
    private static String pluginErrorPrefix = "&7[&4ZUtils Error&7]&4 ";

    public static String sendInfoMessageToPlayer(Player player, String message) {
        player.sendMessage(Beautifier.applyAndSymbolColor(pluginInfoPrefix + message));
        return message;
    }

    public static String sendWarnMessageToPlayer(Player player, String message) {
        player.sendMessage(Beautifier.applyAndSymbolColor(pluginWarnPrefix + message));
        return message;
    }

    public static String sendErrorMessageToPlayer(Player player, String message) {
        player.sendMessage(Beautifier.applyAndSymbolColor(pluginErrorPrefix + message));
        return message;
    }
}
