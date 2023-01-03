package tech.zerobit.log;

public class Logger {

  public static void log(String message) {
    InfoLogger.log(message);
  }

  public static void error(String message) {
    ErrorLogger.log(message);
  }

  public static void warn(String message) {
    WarnLogger.log(message);
  }




  public static void log(String... message) {
    InfoLogger.log(String.join(" ", message));
  }

  public static void error(String... message) {
    ErrorLogger.log(String.join(" ", message));
  }

  public static void warn(String... message) {
    WarnLogger.log(String.join(" ", message));
  }

}
