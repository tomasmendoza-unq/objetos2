package Enums;

public enum EstadoCivil {
    VIUDO(0.0),
    SOLTERO(0.0),
    CASADO(100.0),
    DIVORCIADO(0.0);

    private final Double beneficioAdicional;

     EstadoCivil(Double beneficioAdicional){
         this.beneficioAdicional = beneficioAdicional;
     }

    public Double getBeneficioAdicional() {
        return beneficioAdicional;
    }
}
