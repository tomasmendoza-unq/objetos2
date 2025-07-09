package parcial_23_11;

import java.time.LocalDate;

public abstract class ProdTuristico {

    LocalDate fin;
    LocalDate inicio;

    public ProdTuristico(LocalDate fin, LocalDate inicio) {
        this.fin = fin;
        this.inicio = inicio;
    }

    abstract double getPrecio();
    LocalDate fin(){
        return fin;
    }
    LocalDate inicio(){
        return inicio;
    }

}
