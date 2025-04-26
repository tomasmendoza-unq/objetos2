package ar.edu.unq.poo2.tp3;

public class Rectangulo {

    private Double base;

    private Double altura;

    private Point origen;

    public Rectangulo(Double base, Double altura, Point origen) {
        this.base = base;
        this.altura = altura;
        this.origen = origen;
    }

    public Double area(){
        return altura * base;
    }

    public Double perimetro(){
        return 2 * (altura+base);
    }

    public Boolean esVertical(){
      return base > altura;
    }

    public Boolean esHorizontal(){
        return altura > base;
    }


}
