package EJ5;

public class mainTiempo {
//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores:
//un constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta(). 
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(1,30,45);
        System.out.println(tiempo.toString());
    }

}
