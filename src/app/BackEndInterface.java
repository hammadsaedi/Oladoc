package app;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class BackEndInterface implements Serializable {
    private boolean isAdmin;
    private Person person;
    private Database db;
    private FileOperations<Database> op;

    public BackEndInterface() {
    }

    public BackEndInterface(String path) {
        op = new FileOperations<>(path);
        try {
            db = op.seek();
        } catch (ClassNotFoundException cnfExp) {
            throw new RuntimeException("File has not appropriate class.");
        } catch (IOException ioExp) {
            throw new RuntimeException("General IO Exception");
        }
    }

    public BackEndInterface(Database db, String path) {
        op = new FileOperations<>(path);
        this.db = db;
    }

    public Person getLoggedInUser() {
        return person;
    }

    // User Registration
    public void registerDoctor(String id, String password, String firstName, String lastName, int age, String gender,
            String number, String cnic, String email, Address address, String specialization, Timing timing,
            Hospital hospital, double experience, double hourlyCharges, double balance) {
        // validation checks
        db.registerDoctor(id, password, firstName, lastName, age, gender, number, cnic, email, address, specialization,
                timing, hospital, experience, hourlyCharges, balance);
        updateDatabase();
    }

    public void registerPatient(String firstName, String lastName, int age, String gender, String number, String cnic,
            String email, Address address, String id, String password, String bloodGroup, double balance) {
        // validation checks
        db.registerPatient(firstName, lastName, age, gender, number, cnic, email, address, id, password, bloodGroup,
                balance);
        updateDatabase();
    }

    // User Login / Logout
    public void loginAdmin(String userName, String password) {
        isAdmin = db.isAdmin(userName, password);
    }

    public void logOutAdmin() {
        isAdmin = false;
    }

    public void loginDoctor(String userName, String password) {
        person = db.loginDoctor(userName, password);
    }

    public void loginPatient(String userName, String password) {
        person = db.loginPatient(userName, password);
    }

    public void logOutUser() {
        person = null;
    }

    public ArrayList<Doctor> getDoctors() {
        return db.getDoctors();
    }

    public ArrayList<Appointment> getAppointments(Person person) {
        ArrayList<Appointment> appointments = db.getAppointments();
        ArrayList<Appointment> filtered = new ArrayList<>();
        try {
            Patient patient = (Patient) person;
            for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).getPatient().equals(patient)) {
                    filtered.add(appointments.get(i));
                }
            }
        } catch (ClassCastException exp) {
            Doctor doctor = (Doctor) person;
            for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).getDoctor().equals(doctor)) {
                    filtered.add(appointments.get(i));
                }
            }
        } catch (Exception exp) {
            throw new RuntimeException("General Exceptions.");
        }
        return filtered;
    }

    public static ArrayList<Appointment> filterAppointment(ArrayList<Appointment> appointments, Status status) {
        ArrayList<Appointment> filtered = new ArrayList<>();
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getStatus().equals(status)) {
                filtered.add(appointments.get(i));
            }
        }
        return filtered;
    }

    // Make Appointment (By Patient)
    public void makeAppointment(Doctor doctor, Date date, Time time, Mode mode) {
        try {
            db.makeAppointment((Patient) person, doctor, date, time, Status.PENDING, mode);
        } catch (ClassCastException exp) {
            throw new RuntimeException("Patient is not logged in.");
        }
        updateDatabase();
    }

    public void updateAppointment(Appointment appointment, Status status) {
        if (status.equals(Status.COMPLETED)) {
            appointment.getPatient().addReceipt(new Receipt(appointment, 100));
        } else {
            appointment.setStatus(status);
        }
        updateDatabase();
    }

    public ArrayList<Receipt> getReceipt(Patient patient) {
        return patient.getReceipt();
    }

    public void payBill(Patient patient, Receipt receipt) {
        if (receipt.getAmount() > patient.getBalance())
            throw new RuntimeException("Patient is out of balance");
        patient.setBalance(patient.getBalance() - receipt.getAmount());
        receipt.setPaid(true);
        updateDatabase();
    }

    // Edit Profile Option
    void setTiming() {
        try {
            Doctor doctor = (Doctor) person;
            doctor.setTiming(new Timing(new Time(9, 59, 11), new Time(9, 59, 11)));
        } catch (ClassCastException exp) {
            throw new RuntimeException("Doctor is not logged in.");
        }
        updateDatabase();
    }

    // Give Feedback

    // Reply on Feedback

    // Update Database
    public void updateDatabase() {
        try {
            op.push(db);
        } catch (IOException ioExp) {
            throw new RuntimeException("General IO Exception");
        }
    }

    // print user
    void printUser() {
        System.out.println(person);
    }

    void printDb() {
        System.out.println(db);
    }
}