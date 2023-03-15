package com.bridgelabz;



}
import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    private List<Contact> contacts;

    public AddressBookMain() {
        contacts = new ArrayList<>();
    }

    public void addStock(Contact contact) {
        contacts.add(contact);
    }



    public void printAddressBOOK() {
        System.out.println("ADDRESS BOOK'S INFO:");
        for (Contact contact : contacts) {
            System.out.println(contact.getFirstName() + " - " + contact.getLastName() + " - " + contact.getState() + " - " + );
        }

    }

    public void editStock(int index, String firstname,String lastname, String state) {
        Contact contact = contacts.get(index);
        contact.firstName = firstname;
        contact.lastName = lastname;
        contact.state = state;
    }


    public void deleteStockByName(String name) {
        boolean found = false;
        for (Stock stock : stocks) {
            if (stock.getName().equals(name)) {
                stocks.remove(stock);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Stock with name \"" + name + "\" deleted successfully.");
        } else {
            System.out.println("Stock with name \"" + name + "\" not found.");
        }
    }

    public void deleteStockByName(String name) {
        boolean found = false;
        for (Stock stock : stocks) {
            if (stock.getName().equals(name)) {
                stocks.remove(stock);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Stock with name \"" + name + "\" deleted successfully.");
        } else {
            System.out.println("Stock with name \"" + name + "\" not found.");
        }
    }

    public void deleteAddress(String name){
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.FirstName.equals(name)) {
                contacts.remove(contact);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("contact with name " + name + "deleted successfully.");
        } else {
            System.out.println("contact with name " + name + " not found.");
        }
    }
}