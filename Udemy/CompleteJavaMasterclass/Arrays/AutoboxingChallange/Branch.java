package Udemy.CompleteJavaMasterclass.Arrays.AutoBoxingChallange;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer cst) {
        this.customerArrayList.add(cst);
    }
    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.customerArrayList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String cstName, double amount){
        Customer cst = findCustomer(cstName);
        if (cst != null){
            cst.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String cstName){
        for (int i = 0; i<this.customerArrayList.size();i++){
            Customer checkCustomer = this.customerArrayList.get(i);
            if (checkCustomer.getName().equals(cstName)){
                return checkCustomer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
