package parcial_22_6;

public class Transporte implements Actividad{

    int peso;
    int distancia;
    int precio;

    @Override
    public double getCosto(Gerente gerente) {
        return peso*distancia*precio;
    }
}
