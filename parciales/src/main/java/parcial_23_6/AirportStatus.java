package parcial_23_6;

import java.time.LocalDate;

public interface AirportStatus {
    void airportStatusOK();
    void airportClosed(String reason);
    void departFlight(String flightNumber, LocalDate time);
    void arriveFlight(String flightNumber, LocalDate time);
}
