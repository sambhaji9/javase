package com.collections;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return this.name + "\n" + this.street + "\n"  + this.city + ", " + this.state + ", " + this.code;
    }

}

// A simple mailing list example using collection
public class MailList {
    public static void main(String [] args) {
        LinkedList<Address> mailList = new LinkedList<Address>();
        mailList.add(new Address("Sambhaji", "10", "Johannesburg", "Gauteng", "2196"));
        mailList.add(new Address("Sadhana", "wagholi", "Pune", "Maharashtra", "412207"));
        mailList.add(new Address("Satyam", "MIT", "Massachussets", "California", "207"));
        mailList.add(new Address("Aaradhya", "Harvard", "Boston", "Boston", "412"));

        // Display the mailing list
        for(Address element: mailList) {
            System.out.println(element + "\n");
        }
    }
}
