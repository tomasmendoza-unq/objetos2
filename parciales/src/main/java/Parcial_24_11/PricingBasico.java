package Parcial_24_11;

public class PricingBasico implements EstrategiaPricing{

    Distance distance;

    @Override
    public double calcularPrecio(Direccion origen, Direccion destino, double peso, double volumen) {
        return 100*peso*distance.distancia(origen, destino);
    }
}
