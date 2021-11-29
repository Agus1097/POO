package EJ2;

public class mainCircunferencia {
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo
//real. A continuación se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para calcular el área de la circunferencia (𝐴𝑟𝑒𝑎 = 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑜!
//).
//d) Método para calcular el perímetro (𝑃𝑒𝑟𝑖𝑚𝑒𝑡𝑟𝑜 = 2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑜). 
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(2);
        System.out.println("El area de una circunferencia es: " + circunferencia.area());
        System.out.println("El area de una circunferencia es: " + circunferencia.perimetro());
    }

}
