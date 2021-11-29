package EJ11;

public class mainCafetera {
//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima (la
//cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual
//de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero
//(cafetera vacía).
//11.
//14
//• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la
//capacidad máxima.
//• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la
//capacidad máxima de la cafetera, la ajustará al máximo.
//• Métodos getters y setters.
//• Método llenarCafetera():hace que la cantidad actual sea igual a la capacidad.
//• Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la cantidad
//actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): añade a la cafetera la cantidad de café indicada 
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        ServicioCafetera servicio = new ServicioCafetera();
        
        servicio.llenarCafetera(cafetera);
        servicio.servirTaza(cafetera);
        System.out.println("La cafetera esta vacia: " + servicio.vaciarCafetera(cafetera) + " cc");
        System.out.println("Se le ha agregado " + servicio.agregarCafe(cafetera) + " cc");
    }
    
}
