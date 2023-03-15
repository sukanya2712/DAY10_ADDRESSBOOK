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
}