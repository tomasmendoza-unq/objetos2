package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class Counter {
    private ArrayList<Integer> numeros;


    public Counter() {
        this.numeros = new ArrayList<>();
    }
    public void addNumber(int numero){
        numeros.add(numero);
    }

    public int getMaxNumWithPar(){
        int maxPares = 0;
        int resultado = 0;

        for (int numero : numeros){
            int cantDigitospPar = this.contarDigitosPares(numero);

            if(cantDigitospPar>maxPares){
                maxPares = cantDigitospPar;
                resultado = numero;
            }
        }

        return resultado;

    }
    private int contarDigitosPares(int numero) {
        int cantidad = 0;

        if (numero == 0) return 1;

        while (numero > 0) {
            int digito = numero % 10;
            if (this.esMultiplo(numero, 2)) {
                cantidad++;
            }
            numero = numero / 10;
        }

        return cantidad;
    }

    public Long getCantPares(){
        return this.getCantMultiplos(2);
    }

    public Long getCantImpares(){
        return numeros.stream().filter(n -> !this.esMultiplo(n,2)).count();
    }

    public Long getCantMultiplos(int multiplo){
        return numeros.stream().filter(n -> this.esMultiplo(n,multiplo)).count();
    }

    private Boolean esMultiplo(int n, int m){
        return n%m == 0;
    }

    public int getNumMultXY(int x, int y) {
        int range = 1000;

        while (range > 0 &&  !(this.esMultiplo(range,x) && this.esMultiplo(range,y))  ){

            range--;
        }

        return (range == 0) ? -1 : range;

    }
}
