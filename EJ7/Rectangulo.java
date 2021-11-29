package EJ7;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public void mostrar() {
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        for (int i = 0; i < (altura - 2); i++) {
            System.out.println("");
            System.out.print("*");
            for (int j = 0; j < (base + 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
