package Udemy.CompleteJavaMasterclass.Arrays.AutoBoxingChallange;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchArrayList;

    public Bank(String name) {
        this.name = name;
        this.branchArrayList = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (this.findBranch(branchName) == null) {
            this.branchArrayList.add(new Branch(branchName));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName, initAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i<this.branchArrayList.size();i++){
            Branch checkBranch = this.branchArrayList.get(i);
            if (checkBranch.getName().equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomerArrayList();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactionsArrayList();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
        }return false;
    }
}
