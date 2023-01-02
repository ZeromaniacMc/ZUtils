package tech.zerobit.log;

import java.util.logging.Level;

public class WarnLogger {

    public static void warnLogger(String message) {
        Logger.logger(Level.WARNING, message);
    }

}
