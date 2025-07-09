package parcial_23_11;

import java.time.LocalDate;

public class Pasaje extends ProdTuristico{
    private double valorPersona;
    private String nomAero;
    private IOperator iOperator;

    public Pasaje(LocalDate fin, LocalDate inicio, double valorPersona, String nomAero) {
        super(fin, inicio);
        this.valorPersona = valorPersona;
        this.nomAero = nomAero;
    }

    @Override
    double getPrecio() {
        return valorPersona + iOperator.taxes(nomAero, inicio);
    }
}
