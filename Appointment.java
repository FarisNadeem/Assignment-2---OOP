package assignment2.organizations.beauty;

import java.time.LocalDateTime; // Or use a suitable Date/Time class

public class Appointment {
    private String clientName;
    private String service;
    private LocalDateTime dateTime;

    public Appointment(String clientName, String service, LocalDateTime dateTime) {
        this.clientName = clientName;
        this.service = service;
        this.dateTime = dateTime;
    }

    // Getters and setters for clientName, service, and dateTime

    // Consider adding methods like rescheduleAppointment() if needed
}
