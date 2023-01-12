package app;

import java.io.Serializable;
import java.util.ArrayList;

public class Patient extends Person implements SignIn, Serializable {
    private String id;
    private String password;
    private String bloodGroup;
    private double balance;
    private ArrayList<Receipt> receipts;

    public Patient(String firstName, String lastName, int age, String gender, String number, String cnic, String email,
            Address address, String id, String password, String bloodGroup, double balance) {
        super(firstName, lastName, age, gender, number, cnic, email, address);
        this.id = id;
        this.password = password;
        this.bloodGroup = bloodGroup;
        this.balance = balance;
        receipts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    public ArrayList<Receipt> getReceipt() {
        return receipts;
    }

    @Override
    public String toString() {
        return super.toString() + "Patient [Patient Id: " + id + ", Blood Group: " + bloodGroup + ", Balance: "
                + balance + "]";
    }
}
