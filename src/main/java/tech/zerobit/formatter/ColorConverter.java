package tech.zerobit.formatter;


import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorConverter {

    public static final List<Pattern> VALID_HEX_PATTERNS = Arrays.asList(
            Pattern.compile("&#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])"),
            Pattern.compile("#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])"),
            Pattern.compile("\\{#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])}"));

    public static String convertHexToBukkitFormat(String input) {
        for (Pattern pattern : VALID_HEX_PATTERNS) {
            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                String bukkitColorCode = "§x§" + matcher.group(1).toUpperCase()
                        + "§" + matcher.group(2).toUpperCase()
                        + "§" + matcher.group(3).toUpperCase()
                        + "§" + matcher.group(4).toUpperCase()
                        + "§" + matcher.group(5).toUpperCase()
                        + "§" + matcher.group(6).toUpperCase();
                matcher.appendReplacement(sb, bukkitColorCode);
            }

            matcher.appendTail(sb);
            input = sb.toString();
        }
        return input;
    }

    public static Color convertHexToRGB(String colorStr) {
        return new Color(Integer.valueOf(colorStr.substring(1, 3), 16), Integer.valueOf(colorStr.substring(3, 5), 16),
                Integer.valueOf(colorStr.substring(5, 7), 16));
    }

    public static String convertRBGToHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
}
