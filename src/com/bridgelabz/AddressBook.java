package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook entry = new AddressBook();

        System.out.println("Welcome to Address Book Program in Java!");
        System.out.println("You can create Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");

        entry.addContact();
    }

    public void addContact() {
        System.out.println("\nCreating a new contact!");
        System.out.print("Enter First Name :	");
        String firstname = sc.next();
        System.out.print("Enter Last Name :	");
        String lastname = sc.next();
        System.out.print("Enter City :	");
        String city = sc.next();
        System.out.print("Enter State :	");
        String state = sc.next();
        System.out.print("Enter zip :	");
        int zip = sc.nextInt();
        System.out.print("Enter Phone Number :	");
        String number = sc.next();
        System.out.print("Enter Email Address :	");
        String email = sc.next();

        Contact newcontact = new Contact();
        Address address = new Address();
        newcontact.setFirstName(firstname);
        newcontact.setLastName(lastname);
        newcontact.setPhoneNumber(number);
        newcontact.setEmailID(email);
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);
        newcontact.setAddress(address);
        displayContact(newcontact);
    }

    public void displayContact(Contact contact) {
        System.out.println(contact);
    }


}

