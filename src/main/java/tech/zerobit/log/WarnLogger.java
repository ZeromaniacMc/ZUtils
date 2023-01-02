package tech.zerobit.log;

import tech.zerobit.formatter.Beautifier;

import java.util.logging.Level;

public class WarnLogger extends Logger {

    public static void log(String message) {
        log(Level.WARNING, Beautifier.applyAndSymbolColor(warnLogPrefix), Beautifier.applyAndSymbolColor(message));
    }
    private static String warnLogPrefix = "&7[&cZUtils Warning&7]&c ";

}
