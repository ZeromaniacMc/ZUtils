package tech.zerobit.log;

import org.bukkit.Bukkit;
import java.util.logging.Level;

public abstract class ALogger {
    static void log(Level level, String prefix, String message) {
        Bukkit.getLogger().log(level, prefix, message);
    }
}
