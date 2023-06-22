package org.example;

public class Address {
    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    String address;
    Address(String address){
        this.address = address;
    }

}
