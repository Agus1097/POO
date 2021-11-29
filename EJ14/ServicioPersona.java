package EJ14;

import java.util.Locale;
import java.util.Scanner;

public class ServicioPersona {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    double IMC;

    public void llenarDatos(Persona persona) {
        System.out.println("Ingresar nombre");
        persona.setNombre(sc.next());
        System.out.println("Ingresar edad");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingresar sexo (H, M, O)");
        persona.setSexo(sc.next());
        System.out.println("Ingresar peso (kg)");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingresar altura (m)");
        persona.setAltura(sc.nextDouble());
    }

    public int calcularIMC(Persona persona) {
        IMC = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 & IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void MostrarIMC(Persona persona) {
        if (this.calcularIMC(persona) == (-1)) {
            System.out.println("IMC: " + this.calcularIMC(persona));
            System.out.println("La persona tiene menor peso de lo ideal");
        } else if (this.calcularIMC(persona) == 0) {
            System.out.println("IMC: " + this.calcularIMC(persona));
            System.out.println("La persona esta bien");
        } else if (this.calcularIMC(persona) == 1) {
            System.out.println("IMC: " + this.calcularIMC(persona));
            System.out.println("La persona tiene sobrepeso");
        }
    }

    public void esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public boolean ComprobarSexo(Persona persona) {
        if (persona.getSexo().equals("H") || (persona.getSexo()).equals("M") || (persona.getSexo()).equals("O")) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarDatos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Altura: " + persona.getAltura());
    }
}
