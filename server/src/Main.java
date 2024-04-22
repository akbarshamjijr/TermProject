import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner item = new Scanner(System.in);
        System.out.println("enter requirement");
        String input = item.nextLine();
        System.out.println(input);
        try {
            Document doc = Jsoup.connect("https://www.wholefoodsmarket.com/product/365-by-whole-foods-market-organic-walnut-halves-pieces-10-oz-b07glt4z49").get();
            Elements buttons = doc.select("div.w-pie--dietary-badge");
            int count = 0;
            int ketoCount = 0;
            for (Element button : buttons) {

                System.out.println(button);
                if(button.text().contains("Paleo")){
                    System.out.println("Paleo recognised");
                }
                System.out.println("XX");
                count += 1;
            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}