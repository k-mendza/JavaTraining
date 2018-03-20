package udemy.completeJavaMasterclass;

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
        temp = new StockItem("Bup", 0.50, 200);
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
    }
}
