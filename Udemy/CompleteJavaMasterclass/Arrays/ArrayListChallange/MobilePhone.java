package Udemy.CompleteJavaMasterclass.Arrays.ArrayListChallange;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName())>=0){
            System.out.println("Contact is already in file ");
            return false;
        }else {
            myContacts.add(contact);
            return true;
        }
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for (int i =0; i < this.myContacts.size();  i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact + " was removed");
        return true;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact + " was replaced by " + newContact);
        return true;
    }
    public String qureyContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact list ");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + " " + this.myContacts.get(i).getName() + " " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
