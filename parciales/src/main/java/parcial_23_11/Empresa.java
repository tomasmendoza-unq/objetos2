package parcial_23_11;

import java.util.List;

public class Empresa {

    public double calcularCosto(List<ProdTuristico> prodTurisitcos){
        return prodTurisitcos.stream().mapToDouble(ProdTuristico::getPrecio).sum();
    }
}
