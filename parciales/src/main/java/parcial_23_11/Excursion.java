package parcial_23_11;

import java.time.LocalDate;

public class Excursion extends ProdTuristico{

    private double valorPersona;

    private double impuestos;

    public Excursion(LocalDate fin, LocalDate inicio, double valorPersona, double impuestos) {
        super(fin, inicio);
        this.valorPersona = valorPersona;
        this.impuestos = impuestos;
    }

    @Override
    public double getPrecio() {
        return valorPersona+impuestos;
    }

    @Override
    public LocalDate fin() {
        return null;
    }

    @Override
    public LocalDate inicio() {
        return null;
    }
}
