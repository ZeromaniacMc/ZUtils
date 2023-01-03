package tech.zerobit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tech.zerobit.ZUtils;
import tech.zerobit.log.Logger;
import tech.zerobit.staticmessages.CommonMessages;
import tech.zerobit.staticmessages.PlayerMessage;

import java.util.Arrays;
import java.util.List;

public class ReloadCommand implements CommandHandler {

    ZUtils plugin;

    public ReloadCommand(ZUtils plugin){
        this.plugin = plugin;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return Arrays.stream(new String[]{"reload"}).toList();
    }

    @Override
    public boolean executeCommandAsPlayer(Player sender, Command command, String label, String[] args) {
        Player player = sender;
        if (args.length == 0) {
            PlayerMessage.sendErrorMessageToPlayer(player, CommonMessages.INVALID_COMMAND);
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                if (player.hasPermission("zutils.reload")) {
                    //ConfigHandler.reloadAllConfigs();
                    //PlayerHelper.playerMessage(player, PlayerHelper.CONFIGS_RELOADED);
                } else {
                    PlayerMessage.sendErrorMessageToPlayer(player, CommonMessages.NO_PERMISSION);
                }
            }
        }
        return true;
    }

    @Override
    public boolean executeCommandAsConsole(ConsoleCommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            Logger.log(CommonMessages.INVALID_COMMAND);
        } else if (args[0].equalsIgnoreCase("reload")) {
            //ConfigHandler.reloadAllConfigs();
            Logger.log(CommonMessages.CONFIGS_RELOADED);
        }
        return true;
    }
}
