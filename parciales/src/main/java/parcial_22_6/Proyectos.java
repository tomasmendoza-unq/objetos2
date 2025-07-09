package parcial_22_6;

import java.util.List;

public class Proyectos implements Actividad{

    List<Actividad> actividades;

    public double getCosto(Gerente gerente){
        return actividades.stream().mapToDouble(actividad -> actividad.getCosto(gerente)).sum();
    }
}
