package udemy.completeJavaMasterclass;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("Bread", 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("Cake", 1.10, 7);
	    stockList.addStock(temp);
        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("Chair", 62.00, 10);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.47, 7);
        stockList.addStock(temp);
        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket karBasket = new Basket("Kar");
        sellItem(karBasket, "Car", 1);
        System.out.println(karBasket);
        sellItem(karBasket, "Car", 1);
        System.out.println(karBasket);

        if (sellItem(karBasket, "Car", 1) != 1){
            System.out.println("There are no more cars in stock");
        }
        sellItem(karBasket, "Spanner", 1);
        System.out.println(karBasket);

        sellItem(karBasket, "Juice", 4);
        sellItem(karBasket, "Cup", 12);
        sellItem(karBasket, "Phone", 1);
        System.out.println(karBasket);
        System.out.println(stockList);

//        temp = new StockItem("Pen", 1.12, 1);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("Car").adjustStock(2000);
        stockList.Items().get("Car").adjustStock(-1000);
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
