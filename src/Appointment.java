import java.io.Serializable;

public class Appointment implements Serializable {
    private Patient patient;
    private Doctor doctor;
    private Time time;
    private Status status;
    private Mode mode;

    public Appointment(Patient patient, Doctor doctor, Time time, Status status, Mode mode) {
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
        this.status = status;
        this.mode = mode;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Appointment [Patient: " + patient + ", Doctor: " + doctor + ", Time: " + time + ", Status: " + status
                + ", Mode: " + mode + "]";
    }
}
