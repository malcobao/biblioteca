package biblioteca;

public class Libro extends MaterialBiblioteca {
    private int numeroPaginas;
    private String genero;

    public Libro(int id, String titulo, String autor, int anioPublicacion,
                 int numeroPaginas, String genero) {
        super(id, titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n   Páginas: " + numeroPaginas + " | Género: " + genero;
    }
}
