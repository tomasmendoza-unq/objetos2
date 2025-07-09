package parcial_22_6;

public class Operario {

    int horasTrabajadas;
    int valorXHs;
    int antiguedad;


    public double getCosto() {
        int valor = (valorXHs * horasTrabajadas);
        return valor + antiguedad>5 ? (valor/100)*10 : 0;
    }
}
