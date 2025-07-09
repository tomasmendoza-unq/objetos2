package parcial_23_6;

import java.util.List;
import java.util.Map;

public class Sistema {

    Map<Evento, List<AirportStatus>> observadores ;


    public void notificar(Evento evento) {
        List<AirportStatus> airportStatuses = observadores.get(evento);

        for (AirportStatus observer : airportStatuses) {
            evento.notificar(observer);
        }
    }
}
