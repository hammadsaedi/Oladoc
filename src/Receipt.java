import java.io.Serializable;

public class Receipt implements Serializable {
    private Appointment appointment;
    private double amount;
    private boolean isPaid;

    // amount has to be calculated on base of appointment
    public Receipt(Appointment appointment) {
        this.appointment = appointment;
        this.amount = 100;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Receipt [Appointment: " + appointment + ", Amount: " + amount + ", Paid: " + isPaid + "]";
    }
}
