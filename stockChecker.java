package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class stockChecker {
    public static boolean isPokemonEmeraldInStock() {
        try {
            // Replace with actual GameStop product page
            String url = "https://www.gamestop.com/video-games/products/pokemon-emerald-version---game-boy-advance/10078119.html";

            // Connect and fetch the HTML
            Document doc = Jsoup.connect(url).get();

            // Find the correct selector by inspecting GameStop's site
            Elements stockStatus = doc.select(".add-to-cart-buttons"); // Example selector

            return stockStatus.text().toLowerCase().contains("add to cart"); // Or "in stock", etc.
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
