package EJ19;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class mainCalendario {
//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento, por lo
//que debe ser posible pedirle su nombre, fecha de nacimiento y edad.
//• Métodos get y set para llenar el objeto en el Main.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta
//que para conocer la edad de la persona también se debe conocer la fecha actual.
//• Agregar a la clase el método menorQue(Persona persona) que recibe como parámetro a otra
//persona y retorna true en caso de que el receptor tenga menor edad que la persona que se
//recibe como parámetro, o false en caso contrario.
//• Agregar un método de creación del objeto que respete la siguiente firma: Persona(String
//nombre, Date fechaNacimiento). Este método recibe como parámetros el nombre y la fecha
//de nacimiento de la persona a crear y retorna un objeto inicializado con los valores recibidos
//como parámetro. 
    
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        Date fechaActual = new Date();
        calendar.setTime(fechaActual);
        
        Persona persona = new Persona();
        ServicioPersona servicio = new ServicioPersona();
        
        servicio.llenarDatos(persona, calendar);
        servicio.calcularEdad(persona);

    }

}
