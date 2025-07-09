package Parcial_24_11;

import java.util.List;

public class Paquete implements Envio{

    List<Envio> envios;

    public Paquete(List<Envio> envios) {
        this.envios = envios;
    }

    @Override
    public double getPrecio() {
        return envios.stream().mapToDouble(Envio::getPrecio).sum()* 1.05;
    }
}
