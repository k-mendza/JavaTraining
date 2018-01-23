package Udemy.CompleteJavaMasterclass.Arrays.ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrroceryItem(String item){
        groceryList.add(item);
    }
    // to print items in ArrayList
    public void printGroceryList(){
        System.out.println("Grocery list: " +groceryList.size());
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }
    // to update item in ArrayList[position]
    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
    }
    // to remove item in ArrayList[position]
    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    // return position of item in the ArrayList
    public String findItem(String searchItem){
         // boolean exists = groceryList.contains(searchItem);
         int position = groceryList.indexOf(searchItem);
         if (position >= 0){
             return groceryList.get(position);
         }
         return null;
    }
}
