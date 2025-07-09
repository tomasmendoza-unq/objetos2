package Parcial_24_11;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Encomienda> encomiendas;
    EstrategiaPricing pricing;

    public Empresa (){
        encomiendas = new ArrayList<>();
    }

    public void setEstrategiaPricing(EstrategiaPricing pricing){
        pricing = pricing;
    }

    public Encomienda crearEncomienda(Direccion origen, Direccion destino, double peso, double volumen) {
        double precio = pricing.calcularPrecio(origen, destino, peso, volumen);
        Encomienda encomienda = new Encomienda(origen, destino, peso, volumen, precio);
        encomiendas.add(encomienda);
        return encomienda;
    }

    public void realizarEnvios(Envio envio){

    }

}
