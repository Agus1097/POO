package EJ7;

public class mainRectangulo {
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado alto y un
//atributo privado largo, dados por el usuario. La clase también incluirá un método para calcular la
//superficie del rectángulo, un método para calcular el perímetro del rectángulo y otro que desplace el
//rectángulo en el plano. Y por último tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y
//constructores correspondientes. 
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo (6,4);
        System.out.println("El area del rectangulo es: " + rectangulo.area());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.perimetro());
        rectangulo.mostrar(); 
    }
}
