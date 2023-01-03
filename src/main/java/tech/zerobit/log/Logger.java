package tech.zerobit.log;

public class Logger extends ALogger {

  public static void log(String message) {
    InfoLogger.log(message);
  }

  public static void error(String message) {
    ErrorLogger.log(message);
  }

  public static void warn(String message) {
    WarnLogger.log(message);
  }

}
