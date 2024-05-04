package assignment2.organizations.beauty;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import java.util.ArrayList;
import java.util.List;

public class BeautySalon extends Organization implements Contactable {
    private List<assignment2.organizations.beauty.Appointment> appointments = new ArrayList<>();

    public BeautySalon(String name) {
        super(name);
    }

    public void addAppointment(assignment2.organizations.beauty.Appointment appointment) {
        appointments.add(appointment);
    }

    public boolean cancelAppointment(assignment2.organizations.beauty.Appointment appointment) {
        return appointments.remove(appointment);
    }

    public List<assignment2.organizations.beauty.Appointment> getAppointments() {
        return appointments;
    }

    // Implement methods from Contactable
    @Override
    public String getEmail() {
        // Replace with your salon's email
        return "beauty.salon@example.com";
    }

    @Override
    public String getAddress() {
        // Replace with your salon's address
        return "123 Main Street, Anytown";
    }

    @Override
    public String getPhoneNumber() {
        // Replace with your salon's phone number
        return "(123) 456-7890";
    }
}
