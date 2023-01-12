package app;

import java.io.Serializable;

public class Hospital implements Serializable {
    private String name;
    private Address address;

    public Hospital(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hospital [Name: " + name + ", Address: " + address + "]";
    }
}
