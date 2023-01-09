import java.io.Serializable;
import java.util.ArrayList;

public class Database implements Serializable {
    private Admin admin;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;

    public Database(Admin admin) {
        this.admin = admin;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public Doctor registerDoctor(String id, String password, String firstName, String lastName, int age, String gender,
            String number, String cnic,
            String email,
            Address address, String specialization, Timing timing, Hospital hospital, double experience,
            double hourlyCharges, double balance) {
        Doctor doctor = new Doctor(id, password, firstName, lastName, age, gender, number, cnic, email, address,
                specialization, timing, hospital, experience, hourlyCharges, balance);
        doctors.add(doctor);
        return doctor;
    }

    public Patient registerPatient(String firstName, String lastName, int age, String gender, String number,
            String cnic, String email,
            Address address, String id, String password, String bloodGroup, double balance) {
        Patient patient = new Patient(firstName, lastName, age, gender, number, cnic, email, address, id, password,
                bloodGroup, balance);
        patients.add(patient);
        return patient;
    }

    public void changeAdmin(String username, String password) {
        admin.setId(username);
        admin.setPassword(password);
    }

    public boolean isAdmin(String username, String password) {
        return admin.getId().equals(username) && admin.getPassword().equals(password);
    }

    public Doctor loginDoctor(String username, String password) {
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            if (doctor.getId().equals(username) && doctor.getPassword().equals(password))
                return doctor;
        }
        return null;
    }

    public Patient loginPatient(String username, String password) {
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            if (patient.getId().equals(username) && patient.getPassword().equals(password))
                return patient;
        }
        return null;
    }

    public void makeAppointment(Patient patient, Doctor doctor, Date date, Time time, Status status, Mode mode) {
        for (int i = 0; i < appointments.size(); i++) {
            Appointment pointer = appointments.get(i);
            if (pointer.getDoctor().equals(doctor) && pointer.getDate().equals(date)
                    && ValidationUnit.isOverlapping(time, pointer.getTime()))
                throw new RuntimeException("Timing Overlapped");
        }
        // is Doctor is available at that time?
        Appointment appointment = new Appointment(patient, doctor, date, time, status, mode);
        appointments.add(appointment);
    }

    public void inspectPatient(Appointment appointment) {

    }
}