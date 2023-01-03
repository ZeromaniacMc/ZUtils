package tech.zerobit.log;

import tech.zerobit.formatter.Beautifier;

import java.util.logging.Level;

public class ErrorLogger extends ALogger {
    public static void log(String message) {
        log(Level.SEVERE, Beautifier.applyAndSymbolColor(errorLogPrefix), Beautifier.applyAndSymbolColor(message));
    }
    private static String errorLogPrefix = "&7[&4ZUtils Error&7]&4 ";
}
