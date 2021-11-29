package EJ15;

import java.util.Locale;
import java.util.Scanner;

public class ServicioCadena {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    String letra;
    int contador;
    String caracter;
    String nuevaFrase;

    public int mostrarVocales(Cadena cadena) {
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().substring(i, i + 1);
            if (letra.equals("a")) {
                contador++;
            }
            if (letra.equals("e")) {
                contador++;
            }
            if (letra.equals("i")) {
                contador++;
            }
            if (letra.equals("o")) {
                contador++;
            }
            if (letra.equals("u")) {
                contador++;
            }
        }
        return contador;
    }

    public void invertirFrase(Cadena cadena) {
        System.out.println("La frase invertida es: ");
        contador = cadena.getLongitud();
        for (int i = contador - 1; i < contador; i--) {
            letra = cadena.getFrase().substring(i, i + 1);
            System.out.print(letra);
            if (i == 0) {
                break;
            }
        }
        System.out.println("");
    }

    public int vecesRepetido(Cadena cadena) {
        System.out.println("");
        System.out.println("Ingrese una letra: ");
        caracter = sc.next();
        contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(caracter)) {
                contador++;
            }
        }
        return contador;
    }

    public void reemplazarCaracter(Cadena cadena) {
        System.out.println("Ingrese un caracter: ");
        caracter = sc.next();
        System.out.println("Se reemplazo la 'a' por el caracter ingresado: ");
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().substring(i, i + 1);
            if (letra.equals("a")) {
                System.out.print(caracter);
            } else{
                System.out.print(letra);
            }
        }
        System.out.println("");
    }

}
