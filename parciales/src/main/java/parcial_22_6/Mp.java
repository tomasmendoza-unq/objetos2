package parcial_22_6;

public class Mp implements FormaDePago{
    @Override
    public double getCosto(int precio) {
        return precio - (precio/100)*3;
    }
}
