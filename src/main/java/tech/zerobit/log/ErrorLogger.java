package tech.zerobit.log;

import java.util.logging.Level;

public class ErrorLogger {

    public static void log(String message) {
        Logger.log(Level.SEVERE, message);
    }
}
