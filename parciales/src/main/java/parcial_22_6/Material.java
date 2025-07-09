package parcial_22_6;

public class Material {

    int cantidad;
    int precioUni;

    public double getCosto(Gerente gerente){
        return gerente.getCosto(cantidad*precioUni);
    }
}
