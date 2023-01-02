package tech.zerobit.log;

import java.util.logging.Level;

public class InfoLogger {

    public static void log(String message) {
        Logger.log(Level.INFO, message);
    }
}
