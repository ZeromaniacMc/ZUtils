package tech.zerobit.log;

import tech.zerobit.formatter.Beautifier;

import java.util.logging.Level;

public class InfoLogger extends ALogger {

    public static void log(String message) {
        log(Level.INFO, Beautifier.applyAndSymbolColor(infoLogPrefix), Beautifier.applyAndSymbolColor(message));
    }

    private static String infoLogPrefix = "&7[&3ZUtils Info&7]&3 ";

}
