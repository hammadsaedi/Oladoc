package app;

import java.io.Serializable;

public class Patient extends Person implements SignIn, Serializable {
    private String id;
    private String password;
    private String bloodGroup;
    private double balance;

    public Patient(String firstName, String lastName, int age, String gender, String number, String cnic, String email,
            Address address, String id, String password, String bloodGroup, double balance) {
        super(firstName, lastName, age, gender, number, cnic, email, address);
        this.id = id;
        this.password = password;
        this.bloodGroup = bloodGroup;
        this.balance = balance;
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

    @Override
    public String toString() {
        return super.toString() + "Patient [Patient Id: " + id + ", Blood Group: " + bloodGroup + ", Balance: "
                + balance + "]";
    }
}
