package main;


import org.example.json.Address;

public class JsonMain {

    public static void main(String[] args) {
        Address address = new Address();
        address.setExtendedAddress("Address");
        System.out.println(address);
    }
}
