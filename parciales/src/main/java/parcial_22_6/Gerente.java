package parcial_22_6;

import java.util.List;

public class Gerente {
    FormaDePago formaDePago;

    public double getCosto(int precio) {
        return formaDePago.getCosto(precio);
    }
}
