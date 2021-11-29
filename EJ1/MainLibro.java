package EJ1;

public class MainLibro {
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor que inicialice esos atributos con los valores pasados como
//parámetros. Definir una instancia para cargar un libro y luego informar mediante otro método
//el número de ISBN, el título y el autor del libro. 
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro(123, "Harry Potter 1", "J. K. Rowling", 300);
        Libro libro2 = new Libro(1234, "Harry Potter 2", "J. K. Rowling", 350);
        Libro libro3 = new Libro(12345, "Harry Potter 3", "J. K. Rowling", 400);
            
        libro1.mostrarDatos();
        libro2.mostrarDatos();
        libro3.mostrarDatos();
    }

}
