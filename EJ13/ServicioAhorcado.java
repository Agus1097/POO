package EJ13;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class ServicioAhorcado {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    String palabra;
    String[] vec;
    String[] vec2;
    String letra;
    boolean resultado;
    String rubro;
    

    public void ingresarPalabra(Ahorcado ahorcado){
        System.out.println("Ingrese el rubro de la palabra: ");
        rubro=sc.next();
        System.out.println("Ingrese la palabra:");
        palabra = sc.next();
        ahorcado.setN(palabra.length());  
    }
    
    public void longitud(Ahorcado ahorcado) {
       
        vec = new String[ahorcado.getN()];
        vec2 = new String[ahorcado.getN()];
        for (int i = 0; i < ahorcado.getN(); i++) {
            vec[i] = String.valueOf(palabra.charAt(i));
        }
        System.out.println("");
        System.out.println("La longitud de la palabra es de " + ahorcado.getN() + " letras.");
        ahorcado.setVector(vec);
        System.out.println("El rubro es de: " + rubro);
        
    }

    public void ingresarLetra(Ahorcado ahorcado) {
        System.out.println("Ingresar una letra");
        letra = sc.next();
        for (int i = 0; i < ahorcado.getN(); i++) {
            if (letra.equals(vec[i])) {
                resultado = true;
                break;
            } else {
                resultado = false;
            }
        }
        if (resultado == true) {
            System.out.println("ACERTOO!! La letra si se encuentra en la palabra");
        } else {
            System.out.println("FALLO :( La letra NO se encuentra en la palabra");
        }
    }

    public void oportunidades(Ahorcado ahorcado) {
        if (resultado == true) {
            System.out.println("El numero de jugadas es : " + ahorcado.getJugadas());
        } else {
            ahorcado.setJugadas(ahorcado.getJugadas() - 1);
            System.out.println("El numero de jugadas es : " + ahorcado.getJugadas());
        }
    }

    public void mostrarPalabra(Ahorcado ahorcado) {
        System.out.println("Estado actual");
        for (int i = 0; i < ahorcado.getN(); i++) {
            if (letra.equals(vec[i])) {
                vec2[i] = letra;
            }
            if (vec2[i] != null) {
                System.out.print(vec2[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    public boolean encontroPalabra(Ahorcado ahorcado) {
        if (Arrays.equals(vec, vec2)) {
            return false;
        } else {
            return true;
        }
    }
}
