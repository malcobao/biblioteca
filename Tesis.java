package biblioteca;

public class Tesis extends MaterialBiblioteca {
    private String universidad;
    private String carrera;
    private String director;

    public Tesis(int id, String titulo, String autor, int anioPublicacion,
                 String universidad, String carrera, String director) {
        super(id, titulo, autor, anioPublicacion);
        this.universidad = universidad;
        this.carrera = carrera;
        this.director = director;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDirector() {
        return director;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getTipo() {
        return "Tesis";
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n   Univ: " + universidad +
                " | Carrera: " + carrera +
                " | Director: " + director;
    }
}
