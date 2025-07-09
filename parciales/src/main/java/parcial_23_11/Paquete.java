package parcial_23_11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paquete extends ProdTuristico{

    private List<ProdTuristico> prodTuristicos;
    private double costoFijo;
    private int porcentajeGestion;

    public Paquete(LocalDate fin, LocalDate inicio, double costoFijo,int porcentajeGestion) {
        super(fin, inicio);
        this.costoFijo = costoFijo;
        this.prodTuristicos = new ArrayList<>();
        this.porcentajeGestion = porcentajeGestion;
    }

    public void addProd(ProdTuristico prodTuristico){
        prodTuristicos.add(prodTuristico);
        fin = prodTuristico.fin().isAfter(fin) ? prodTuristico.fin() : fin;
        inicio = prodTuristico.inicio().isBefore(inicio) ? prodTuristico.inicio() : inicio;
    }

    @Override
    public double getPrecio() {
        double sumatoria = prodTuristicos.stream().mapToDouble(ProdTuristico::getPrecio).sum();
        return sumatoria + costoFijo + (porcentajeGestion/100) * sumatoria;
    }

    @Override
    public LocalDate fin() {
        return fin;
    }

    @Override
    public LocalDate inicio() {
        return inicio;
    }
}
