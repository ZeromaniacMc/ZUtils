package tech.zerobit;

import org.bukkit.plugin.java.JavaPlugin;
import tech.zerobit.formatter.Beautifier;
import tech.zerobit.log.InfoLogger;

public final class ZUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        InfoLogger.log(Beautifier.applyAndSymbolColor("&4Enabling ZUtils!"));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}