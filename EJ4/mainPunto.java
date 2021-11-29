package EJ4;

public class mainPunto {
//Definir una clase llamada Punto con un constructor que inicialice las coordenadas x e y.
//Generar dos instancias, es decir, crear dos objetos llamados punto1 y punto2 y comprobar la
//distancia que existe entre ambos.
    public static void main(String[] args) {
        Punto punto = new Punto(2,2,4,4);
        System.out.println("La distancia entre P1(" + punto.getX1() + "," + punto.getY1() + ") y P2(" + punto.getX2() + "," + punto.getY2() + ") es: " + punto.distancia());
    }
    
}
