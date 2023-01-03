package tech.zerobit.staticmessages;

public class CommonMessages {

    // Never add color codes to messages here!
    // System: Uses logger with colors bleeding from auto-appended prefix.
    // Player: Uses PlayerMessage#send<TYPE>MessageToPlayer (info, warn, error), which come with colors as well.
    public static String INVALID_COMMAND = "Invalid command. Did you mean /zutils reload?";
    public static String NO_PERMISSION = "You do not have permission to use this.";
    public static String CONFIGS_RELOADED = "Configs successfully reloaded!";
}
