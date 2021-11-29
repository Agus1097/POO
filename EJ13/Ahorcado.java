package EJ13;

public class Ahorcado {
    private int N;
    private String[] vector;
    private int jugadas;

    public Ahorcado() {
        jugadas = 7;
    }

    public Ahorcado(int N, String[] vector, int jugadas) {
        this.N = N;
        this.vector = new String[N];
        this.jugadas = jugadas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }
    
}
