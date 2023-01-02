package tech.zerobit.formatter;

import org.bukkit.ChatColor;
import tech.zerobit.validate.StringValidator;

public class Beautifier {

    public static String replaceUnderscoresWithSpaces(String input) {
        if (StringValidator.isStringNotEmptyAndNotNull(input)) {
            return input.replaceAll("_", " ");
        }
        return input;
    }

    public static String capitalizeAllWords(String input) {
        String[] allWordsAsArray = input.split(" ");
        String finalResult = "";

        for (String word : allWordsAsArray) {
            if (word.isEmpty()) {
                continue;
            }

            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            finalResult += firstLetter.toUpperCase() + restOfWord.toLowerCase() + " ";
        }
        return finalResult;
    }

    public static String applyAndSymbolColor(String text) {
        return ChatColor.translateAlternateColorCodes('&',text);
    }

    public static String applyBukkitSymbolColor(String text) {
        return ChatColor.translateAlternateColorCodes('§',text);
    }

}
