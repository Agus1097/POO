package EJ19;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class ServicioPersona {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    int anioA;
    int mesA;
    int diaA;
    int edad;

    public void llenarDatos(Persona persona, Calendar calendar) {
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese el dia de nacimiento: ");
        persona.setDia(sc.nextInt());
        System.out.println("Ingrese el mes de nacimiento: ");
        persona.setMes(sc.nextInt());
        System.out.println("Ingrese el año de nacimiento: ");
        persona.setAnio(sc.nextInt());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(sc.nextInt());

        anioA = calendar.get(Calendar.YEAR);
        mesA = calendar.get(Calendar.MONTH)+1;
        diaA = calendar.get(Calendar.DATE);
    }

    public void calcularEdad(Persona persona) {
        System.out.println("");
        if (persona.getAnio() <= anioA) {
            if (persona.getMes() >= mesA) {
                if (persona.getDia() > diaA) {
                    edad = anioA - persona.getAnio() - 1;
                    System.out.println("Tiene " + edad + " años");
                } else {
                    edad = anioA - persona.getAnio();
                    System.out.println("Tiene " + edad + " años");
                }
            } else {
                edad = anioA - persona.getAnio();
                System.out.println("Tiene " + edad + " años");
            }
        } else {
            System.out.println("No nacio");
        }
    }
}
