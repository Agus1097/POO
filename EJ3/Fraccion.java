package EJ3;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int suma() {
        return numerador + denominador;
    }

    public int restar() {
        return numerador - denominador;
    }

    public double multiplicar() {
        return numerador * denominador;
    }

    public double dividir() {
        return numerador / denominador;
    }

}
