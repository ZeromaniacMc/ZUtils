package tech.zerobit;

import org.bukkit.plugin.java.JavaPlugin;
import tech.zerobit.log.InfoLogger;

public final class ZUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Colors and prefixes are set to be parsed in each logger, no need to worry about that anywhere.
        // Text colors are also set via the prefix, so only use colors in logger if you must overwrite the log-type default color.
        InfoLogger.log("Enabling ZUtils!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}