package Service.impls;

import Models.Concepto;

public class ConceptoFactory {

    public Concepto createConcepto(String descripcion, Double monto){
        return new Concepto(descripcion, monto);
    }
}
