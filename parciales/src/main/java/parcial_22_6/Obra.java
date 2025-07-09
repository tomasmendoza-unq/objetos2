package parcial_22_6;

import java.util.List;

public class Obra implements Actividad{

    List<Material> materiales;
    List<Operario> operaciones;

    @Override
    public double getCosto(Gerente gerente) {
        return materiales.stream().mapToDouble(m -> m.getCosto(gerente)).sum() + operaciones.stream().mapToDouble(Operario::getCosto).sum();
    }
}
