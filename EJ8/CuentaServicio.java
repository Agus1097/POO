package EJ8;

import java.util.Locale;
import java.util.Scanner;

public class CuentaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    double dias;
    double ingreso;
    double retiro;

    public void actualizarSaldo(Cuenta cuenta) {
        System.out.println("Ingresar la cantidad de dias:");
        dias = sc.nextInt();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cuenta.getSaldoActual() * cuenta.getInteresAnual() * (dias / 365));
        System.out.println( "El saldo actualizado es: " + String.format("%.2f", cuenta.getSaldoActual()));
    }

    public void ingresar(Cuenta cuenta) {
        System.out.println("Ingrese la cantidad de dinero a ingresar:");
        ingreso = sc.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        System.out.println("Usted a ingresado: " + ingreso);
        System.out.println("Su saldo es de: " + String.format("%.2f", cuenta.getSaldoActual()));

    }

    public void retirar(Cuenta cuenta) {
        System.out.println("Ingrese la cantidad de dinero a retirar");
        retiro = sc.nextDouble();
        if ((cuenta.getSaldoActual() - retiro) > 0) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted a retirado: " + ingreso);
            System.out.println("Su saldo es de: " + String.format("%.2f", cuenta.getSaldoActual()));
        } else {
            System.out.println("El monto que desea retirar es mayor de lo que tiene en su cuenta");
        }
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo actual es de " + String.format("%.2f", cuenta.getSaldoActual()));
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("Los datos de su cuenta son:");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDNI());
        System.out.println("Interes anual: " + cuenta.getInteresAnual());
    }
}
