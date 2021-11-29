package EJ3;

public class mainFraccion {
//Crear una clase llamada Fraccion que contenga métodos para sumar, restar, multiplicar y dividir
//fracciones. Los argumentos de cada método son el numerador y denominador según corresponda. La
//clase también debe contener un método constructor con parámetros. 
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(6, 2);
        System.out.println("La suma es: " + fraccion.suma());
        System.out.println("La resta es: " + fraccion.restar());
        System.out.println("La multiplicacion es: " + fraccion.multiplicar());
        System.out.println("La divicion es: " + fraccion.dividir());
    }

}
