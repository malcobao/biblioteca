package biblioteca;

public class Periodico extends MaterialBiblioteca {
    private String fechaEdicion;

    public Periodico(int id, String titulo, String autor, int anioPublicacion,
                     String fechaEdicion) {
        super(id, titulo, autor, anioPublicacion);
        this.fechaEdicion = fechaEdicion;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String getTipo() {
        return "Periódico";
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n   Fecha edición: " + fechaEdicion;
    }
}
