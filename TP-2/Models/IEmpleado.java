package Models;

import java.util.Set;

public interface IEmpleado {

    public Double sueldoNeto();

    public Double sueldoBruto();

    public Double retenciones();

    public Set<Concepto> conceptos();
}
