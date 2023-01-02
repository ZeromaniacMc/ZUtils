package tech.zerobit.price;

import java.util.HashMap;
import java.util.Map;

public class PriceShortener {

    public static String shortenPrice(double price) {

        String result = "";
        Map<String, Long> prices = new HashMap<>();
        prices.put("k", 1000L);
        prices.put("m", 1000000L);
        prices.put("b", 1000000000L);
        prices.put("t", 1000000000000L);
        prices.put("q", 1000000000000000L);
        prices.put("qu", 1000000000000000000L);

        for (Map.Entry<String, Long> entry : prices.entrySet()) {
            double priceDivision = (price / entry.getValue());
            long myPrice = (long) (priceDivision * 1000D);
            if (myPrice >= 1000L && myPrice < 1000000L) {
                result = (myPrice / 1000D) + entry.getKey();
                break;
            }
        }
        if (result.isEmpty()) {
            result = String.valueOf(price);
        }
        return result;
    }
}
