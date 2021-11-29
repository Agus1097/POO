package EJ15;

public class mainCadena {
//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su
//longitud. La clase deber tener un constructor mediante el cual se inicialice la frase, con una o
//más palabras ingresadas por el usuario (separadas entre sí por un espacio en blanco) y se
//inicialice de manera automática su longitud. Deberá además implementar los siguientes
//métodos:
//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
//• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida por pantalla.
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//• Método vecesRepetido(), deberá recibir por parámetro un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca", car = 'a', Salida: El carácter 'a' se repite 4 veces.
//• Método compararLongitud(), deberá comparar la longitud de la frase que compone la clase con
//otra nueva frase ingresada por el usuario. 
//19
//• Método unirFrases(), deberá unir la frase contenida en la clase Cadena con una nueva frase
//ingresada por el usuario y mostrar la frase resultante.
//• Método reemplazar(), deberá reemplazar todas las letras “a” que se encuentren en la frase, por
//algún otro carácter seleccionado por el usuario. 
    
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        ServicioCadena servicio = new ServicioCadena();
        System.out.println("La frase es: " + cadena.getFrase());

        System.out.println("");
        System.out.println("Cantidad de vocales: " + servicio.mostrarVocales(cadena));

        System.out.println("");
        servicio.invertirFrase(cadena);

        System.out.println("Cantidad de veces que se repite la letra ingresada es: " + servicio.vecesRepetido(cadena));
        
        System.out.println("");
        servicio.reemplazarCaracter(cadena);
    }

}
