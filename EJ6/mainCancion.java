package EJ6;

public class mainCancion {
//Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir
//además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro
//que reciba como parámetros el título y el autor de la canción. Se deberán además definir los
//métodos getters y setters correspondientes. 
    
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Western", "Ataque 77");
        System.out.println(cancion.toString());
    }
    
}
