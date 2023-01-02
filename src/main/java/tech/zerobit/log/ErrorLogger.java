package tech.zerobit.log;

import java.util.logging.Level;

public class ErrorLogger {

    public static void errorLogger(String message) {
        Logger.logger(Level.SEVERE, message);
    }
}
