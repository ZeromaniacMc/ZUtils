package tech.zerobit.log;

import java.util.logging.Level;

public class WarnLogger {

    public static void log(String message) {
        Logger.log(Level.WARNING, message);
    }

}
