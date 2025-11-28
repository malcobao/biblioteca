package biblioteca;
public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(int id, String titulo, String autor, int anioPublicacion,
                   int numeroEdicion, String mesPublicacion) {
        super(id, titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("   Nº Edición: " + numeroEdicion +
                " | Mes: " + mesPublicacion);
    }
}
