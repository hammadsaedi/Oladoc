import java.io.Serializable;

public class Doctor extends Person implements SignIn, Serializable {
    private String id;
    private String password;
    private String specialization;
    private Timing timing;
    private Hospital hospital;
    private double experience;
    private double hourlyCharges;
    private double balance;

    public Doctor(String id, String password, String firstName, String lastName, int age, String gender, String number,
            String cnic, String email,
            Address address,
            String specialization, Timing timing, Hospital hospital, double experience, double hourlyCharges,
            double balance) {
        super(firstName, lastName, age, gender, number, cnic, email, address);
        this.id = id;
        this.password = password;
        this.specialization = specialization;
        this.timing = timing;
        this.hospital = hospital;
        this.experience = experience;
        this.hourlyCharges = hourlyCharges;
        this.balance = balance;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getHourlyCharges() {
        return hourlyCharges;
    }

    public void setHourlyCharges(double hourlyCharges) {
        this.hourlyCharges = hourlyCharges;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    @Override
    public String toString() {
        return super.toString() + "Doctor [Specialization: " + specialization + ", Timing: " + timing + ", Hospital: "
                + hospital
                + ", Experience: " + experience + ", Hourly Charges: " + hourlyCharges + "]";
    }

}
