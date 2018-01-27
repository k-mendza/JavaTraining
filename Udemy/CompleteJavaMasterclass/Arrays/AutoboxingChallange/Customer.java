package Udemy.CompleteJavaMasterclass.Arrays.AutoBoxingChallange;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactionsArrayList = new ArrayList<Double>();
        addTransaction(transaction);
    }
    public void addTransaction(double dbl){
        this.transactionsArrayList.add(dbl);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }
}
