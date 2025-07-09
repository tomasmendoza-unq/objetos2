package Parcial_24_11;

public class Encomienda implements Envio{
    Direccion origen;
    Direccion destino;
    double peso;
    double volumen;
    double precio;

    public Encomienda(Direccion origen, double precio, Direccion destino, double volumen, double peso) {
        this.origen = origen;
        this.precio = precio;
        this.destino = destino;
        this.volumen = volumen;
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
