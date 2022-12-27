public class Doctor extends Person {
    private String specialization;
    private Timing timing;
    private Hospital hospital;
    private double experience;
    private double hourlyCharges;

    public Doctor(String firstName, String lastName, int age, String gender, String number, String cnic, String email,
            Address address,
            String specialization, Timing timing, Hospital hospital, double experience, double hourlyCharges) {
        super(firstName, lastName, age, gender, number, cnic, email, address);
        this.specialization = specialization;
        this.timing = timing;
        this.hospital = hospital;
        this.experience = experience;
        this.hourlyCharges = hourlyCharges;
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

    @Override
    public String toString() {
        return super.toString() + "Doctor [Specialization: " + specialization + ", Timing: " + timing + ", Hospital: "
                + hospital
                + ", Experience: " + experience + ", Hourly Charges: " + hourlyCharges + "]";
    }
}
