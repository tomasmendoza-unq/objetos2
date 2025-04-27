package Models;

import Service.impls.ConceptoFactory;

import java.util.Set;

public interface IEmpleado {

    public Double sueldoNeto();

    public Double sueldoBruto();

    public Double retenciones();

    public Set<Concepto> conceptos(ConceptoFactory conceptoFactory);

    public void addHaber(ReciboHaber haber);

    String getNombre();

    String getDireccion();

    Set<ReciboHaber> getRecibos();
}
