package EJ11;

import java.util.Locale;
import java.util.Scanner;

public class ServicioCafetera {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    int taza;
    
    public void llenarCafetera(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de cafe");
        cafetera.setCantidadActual(sc.nextInt());
        cafetera.setCapacidadMaxima(cafetera.getCantidadActual());
        System.out.println("La cantidad actual es: " + cafetera.getCantidadActual() + " cc");
        System.out.println("La capacidad maxima es: " + cafetera.getCapacidadMaxima() + " cc");
    }
    
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Indique la capacidad de la taza para servirle el cafe");
        taza = sc.nextInt();
        if (cafetera.getCantidadActual() > taza) {
            System.out.println("Se sirvio " + taza + " cc de cafe");
            System.out.println("Ahora la capacidad actual es: " + (cafetera.getCantidadActual() - taza) + " cc");
        } else {
            System.out.println("Se sirvio " + cafetera.getCantidadActual() + " cc de cafe porque su capacidad no era sufieciente");
            cafetera.setCantidadActual(0);
            System.out.println("La capacidad actual es: " + cafetera.getCantidadActual() + " cc");
        }
    }
    
    public int vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        return cafetera.getCantidadActual();
    }
    
    public int agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
        cafetera.setCantidadActual(sc.nextInt() + cafetera.getCantidadActual());
        return cafetera.getCantidadActual();
    }
}
