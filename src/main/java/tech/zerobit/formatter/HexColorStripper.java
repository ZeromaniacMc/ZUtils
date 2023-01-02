package tech.zerobit.formatter;

import net.md_5.bungee.api.ChatColor;
import tech.zerobit.validate.StringValidator;

import java.util.regex.Pattern;

public class HexColorStripper {

    private static final char BUKKIT_COLOR_CHAR = '\u00a7';
    private static final Pattern BUKKI_HEX_COLOR = Pattern.compile(
            "(?:&|" + BUKKIT_COLOR_CHAR +
                    ")x(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])(?:&|" + BUKKIT_COLOR_CHAR +
                    ")([0-9a-fA-F])");

    public static String stripBukkitFormatHex(String input) {
        if (StringValidator.isStringNotEmptyAndNotNull(input)) {
            return ChatColor.stripColor(BUKKI_HEX_COLOR.matcher(input).replaceAll(""));
        }
        return input;
    }
}
