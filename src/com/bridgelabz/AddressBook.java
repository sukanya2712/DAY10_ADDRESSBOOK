package com.bridgelabz;

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
        }
}
