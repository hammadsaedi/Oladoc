package app;

import java.io.IOException;
import java.io.Serializable;

public class App implements Serializable {
    public static void main(String[] args) throws IOException {
        // Database db = new Database(new Admin("admin", "admin"));
        // Main app = new Main(db, "db");
        // app.registerDoctor("DOC-1", "faoq", "Hammad", "Saeedi", 20, "male",
        // "+923325122004", "36103-410071-1",
        // "faoqzuhair@gmail.com", new Address(1, 2, "Amin Town", "Khanewal",
        // "Pakistan"),
        // "General",
        // new Timing(new Time(59, 59, 11, 1, 1, 2), new Time(59, 59, 11, 1, 1, 2)),
        // new Hospital("Hospital", new Address(12, 3, "Amin Town", "Khanewal",
        // "Pakistan")),
        // 1, 50, 10000);

        BackEndInterface app = new BackEndInterface("db");
        app.loginPatient("amir", "amir12345");
        app.printDb();
        // app.loginDoctor("DOC-1", "faoq");
        // app.printUser();
        // app.setTiming();
        // app.printUser();

        // // Database db = new Database(new Admin("admin", "admin"));
        // Database db = new Database(new Admin("admin", "admin"), "doctors", null,
        // null);

        // app.loginAdmin("admin", "admin");

        // app.loginDoctor("DOC-1", "faoq");
        // System.out.println(app.isAdmin);

        // app.registerPatient("Hammad", "Saeedi", 20, "male", null, null, null, null,
        // "faoq", "faoq12345", "A+", 10000);
        // app.printDb();
        // app.loginPatient("faoq", "faoq12345");
    }
}
