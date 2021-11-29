package EJ8;

public class mainCuenta {
//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual y el interés anual que
//se aplica a la cuenta (porcentaje). Las operaciones asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes con los que llenaremos el objeto en el
//Main.
//• Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario (interés
//anual dividido entre 365 aplicado al saldo actual)
//• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
//• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1234, 1111, 1000, 0.3);
        CuentaServicio servicio = new CuentaServicio();
        servicio.actualizarSaldo(cuenta);
        servicio.ingresar(cuenta);
        servicio.retirar(cuenta);
        servicio.consultarSaldo(cuenta);
        servicio.consultarDatos(cuenta);
    }
}
