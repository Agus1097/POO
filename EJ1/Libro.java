package EJ1;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numerosDePaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numerosDePaginas) {  
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numerosDePaginas = numerosDePaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerosDePaginas() {
        return numerosDePaginas;
    }

    public void setNumerosDePaginas(int numerosDePaginas) {
        this.numerosDePaginas = numerosDePaginas;
    }

    public void mostrarDatos(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numerosDePaginas);
        System.out.println("");
    }

}
