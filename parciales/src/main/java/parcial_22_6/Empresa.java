package parcial_22_6;

import java.util.List;

public class Empresa {
    Gerente gerente;
    Actividad actividad;

    public double getCosto(){
        return actividad.getCosto(gerente);
    }


}
