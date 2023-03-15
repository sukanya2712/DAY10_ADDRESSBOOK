package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to addressbook");
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Contact c= new Contact();
            System.out.print("Enter First Name: ");
            c.setFirstName(sc.next());
            System.out.print("Enter Last Name: ");
            c.setLastName(sc.next());
            System.out.print("Enter State: ");
            c.setState(sc.next());

            System.out.println(c.getFirstName());
            System.out.println(c.getLastName());
            System.out.println(c.getState());
    }
}
