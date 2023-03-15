package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to addressbook");
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of contacts u want to add : ");
            int numContacts = scanner.nextInt();

            AddressBookMain addressCon = new AddressBookMain();
            for (int i = 1; i <= numContacts; i++) {
                System.out.print("Enter First Name: ");
                String firstName = sc.next();
                System.out.print("Enter Last Name: ");
               String LastName = sc.next();
                System.out.print("Enter State: ");
                String State = sc.next();

               Contact contact = new Contact(firstName,LastName,State);
                addressCon.addContact(contact);
            }
              addressCon.printaddressBOOK();

            System.out.println("Enter the index of the contact to edit: ");
            int index = sc.nextInt();

            System.out.println("Enter the new details of the contact:");
            System.out.print("Name: ");
            String firstname = sc.next();
            System.out.print("Number of shares: ");
            String lastname = sc.next();
            System.out.print("Enter state: ");
            String state = scanner.next();

            addressCon.editContact(index, firstname, lastname, state);
            addressCon.printaddressBOOK();
        }

}
