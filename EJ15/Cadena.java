package EJ15;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
        frase = "La vida es bella";
        longitud = frase.length();
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
}
