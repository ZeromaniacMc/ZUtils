package tech.zerobit.log;

import java.util.logging.Level;

public class InfoLogger {

    public static void infoLogger(String message) {
        Logger.logger(Level.INFO, message);
    }
}
