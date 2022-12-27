public class Patient extends Person {
    private String patientId;
    private String bloodGroup;
    private double balance;

    public Patient(String firstName, String lastName, int age, String gender, String number, String cnic, String email,
            Address address, String patientId, String bloodGroup, double balance) {
        super(firstName, lastName, age, gender, number, cnic, email, address);
        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
        this.balance = balance;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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
        return super.toString() + "Patient [Patient Id: " + patientId + ", Blood Group: " + bloodGroup + ", Balance: "
                + balance + "]";
    }
}
