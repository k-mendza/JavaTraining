package Udemy.CompleteJavaMasterclass.Arrays.ArrayListChallange;

import java.util.Scanner;
import java.util.logging.StreamHandler;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("111 222 333");


    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action: ");
            String action = s.nextLine();

            switch (action) {
                case "0":
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case "1":
                    mobilePhone.printContacts();
                    break;
                case "2":
                    addNewContact();
                    break;
                case "3":
                    updateContact();
                    break;
                case "4":
                    removeContact();
                    break;
                case "5":
                    queryContact();
                    break;
                case "6":
                    printActions();
                    break;
                default:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter phone number: ");
        String number = s.nextLine();
        Contact newContact = Contact.createContact(name, number);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added");
        } else {
            System.out.println("Error");
        }
    }

    private static void queryContact() {
        System.out.println("Enter name of contact to be queried: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone " + existingContactRecord.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter name of contact to be deleted: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Success deleting contact");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void updateContact() {
        System.out.println("Enter name of contact to be updated: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name ");
        String newName = s.nextLine();
        System.out.println("Enter new contact number ");
        String newNumber = s.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Success updating record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting phone ");
    }

    private static void printActions() {
        System.out.println("Menu: ");
        System.out.println("\t0 - turn off");
        System.out.println("\t1 - see contacts");
        System.out.println("\t2 - add new contact");
        System.out.println("\t3 - update contact");
        System.out.println("\t4 - remove contact");
        System.out.println("\t5 - query contact");
        System.out.println("\t6 - menu");
        System.out.println("Choose action");
    }
}
