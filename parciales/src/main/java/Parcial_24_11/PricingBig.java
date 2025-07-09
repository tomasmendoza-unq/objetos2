package Parcial_24_11;

public class PricingBig implements EstrategiaPricing{


    @Override
    public double calcularPrecio(Direccion origen, Direccion destino, double peso, double volumen) {
        return volumen>=0.5 ? 150 : 300;
    }
}
