package Models;

public class Concepto {

    private String descripcion;

    private Double monto;

    public Concepto(String descripcion, Double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getMonto() {
        return monto;
    }
}
