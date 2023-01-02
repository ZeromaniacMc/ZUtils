package tech.zerobit;

import org.bukkit.plugin.java.JavaPlugin;
import tech.zerobit.condition.StringCondition;

public final class ZUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new StringCondition();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}