package tech.zerobit.version;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class PluginVersionCheck {
    public String getPluginVersionByName(String pluginName) {
        Plugin[] installedPlugins = Bukkit.getServer().getPluginManager().getPlugins();
        for (int i = 0; i < installedPlugins.length+1; i++) {
            if (installedPlugins[i].getDescription().getName().equalsIgnoreCase(pluginName)) {
                return installedPlugins[i].getDescription().getVersion();
            }
        }
        return "";
    }

    public boolean isPluginByNameInstalled(String pluginName) {
        Plugin[] installedPlugins = Bukkit.getServer().getPluginManager().getPlugins();
        for (int i = 0; i < installedPlugins.length+1; i++) {
            if (installedPlugins[i].getDescription().getName().equalsIgnoreCase(pluginName)) {
                return true;
            }
        }
        return false;
    }

}
