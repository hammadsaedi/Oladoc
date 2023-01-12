import java.io.Serializable;

public class Appointment implements Serializable {
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private Time time;
    private Status status;
    private Mode mode;

    public Appointment(Patient patient, Doctor doctor, Date date, Time time, Status status, Mode mode) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = status;
        this.mode = mode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Appointment other = (Appointment) obj;
        if (patient == null) {
            if (other.patient != null)
                return false;
        } else if (!patient.equals(other.patient))
            return false;
        if (doctor == null) {
            if (other.doctor != null)
                return false;
        } else if (!doctor.equals(other.doctor))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        if (status != other.status)
            return false;
        if (mode != other.mode)
            return false;
        return true;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment [patient=" + patient + ", doctor=" + doctor + ", date=" + date + ", time=" + time
                + ", status=" + status + ", mode=" + mode + "]";
    }
}
