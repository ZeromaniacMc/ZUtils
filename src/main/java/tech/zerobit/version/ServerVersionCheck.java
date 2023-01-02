package tech.zerobit.version;

import org.bukkit.Bukkit;

class ServerVersionCheck {

    protected static final String[] acceptableServerVersions = {"1.19.3", "1.19"};
    public static String getServerVersion() {
        return Bukkit.getServer().getVersion();
    }

    public static boolean isServerVersionSupported() {
        String version = getServerVersion();
        for (String acceptableVersion : acceptableServerVersions) {
            return acceptableVersion.equals(version);
        }
        return false;
    }


}
