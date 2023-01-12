import java.io.IOException;

public class Main {
    boolean isAdmin;
    private Person person;
    private Database db;
    private FileOperations<Database> op;

    Main(String path) {
        op = new FileOperations<>(path);
        try {
            db = op.seek();
        } catch (ClassNotFoundException cnfExp) {
            throw new RuntimeException("File has not appropriate class.");
        } catch (IOException ioExp) {
            throw new RuntimeException("General IO Exception");
        }
    }

    Main(Database db, String path) {
        op = new FileOperations<>(path);
        this.db = db;
    }

    // User Registration
    void registerDoctor(String id, String password, String firstName, String lastName, int age, String gender,
            String number, String cnic, String email, Address address, String specialization, Timing timing,
            Hospital hospital, double experience, double hourlyCharges, double balance) {
        // validation checks
        db.registerDoctor(id, password, firstName, lastName, age, gender, number, cnic, email, address, specialization,
                timing, hospital, experience, hourlyCharges, balance);
        updateDatabase();
    }

    void registerPatient(String firstName, String lastName, int age, String gender, String number, String cnic,
            String email, Address address, String id, String password, String bloodGroup, double balance) {
        // validation checks
        db.registerPatient(firstName, lastName, age, gender, number, cnic, email, address, id, password, bloodGroup,
                balance);
        updateDatabase();
    }

    // User Login / Logout
    void loginAdmin(String userName, String password) {
        isAdmin = db.isAdmin(userName, password);
    }

    void logOutAdmin() {
        isAdmin = false;
    }

    void loginDoctor(String userName, String password) {
        person = db.loginDoctor(userName, password);
    }

    void loginPatient(String userName, String password) {
        person = db.loginPatient(userName, password);
    }

    void logOutUser() {
        person = null;
    }

    // Edit Profile Option
    void setTiming() {
        try {
            Doctor doctor = (Doctor) person;
            doctor.setTiming(new Timing(new Time(9, 59, 11, 1, 1, 2), new Time(9, 59, 11, 1, 1, 2)));
        } catch (ClassCastException exp) {
            throw new RuntimeException("Doctor is not logged in.");
        }
        updateDatabase();
    }

    // Make Appointment (By Patient)
    void makeAppointment(Doctor doctor, Date date, Time time, Mode mode) {
        try {
            db.makeAppointment((Patient) person, doctor, date, time, Status.PENDING, mode);
        } catch (ClassCastException exp) {
            throw new RuntimeException("Patient is not logged in.");
        }
        updateDatabase();
    }

    // Server and Make Recept
    void servePatient(Appointment appointment) {

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