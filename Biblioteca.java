package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<MaterialBiblioteca> materiales;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<MaterialBiblioteca> getMateriales() {
        return materiales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateriales(ArrayList<MaterialBiblioteca> materiales) {
        this.materiales = materiales;
    }

    public void agregarMaterial(MaterialBiblioteca material) {
        materiales.add(material);
    }

    public void listarTodos() {
        System.out.println("=== Materiales en " + nombre + " ===");
        for (MaterialBiblioteca m : materiales) {
            m.mostrarInfo();
        }
    }

    public void listarDisponibles() {
        System.out.println("=== Materiales disponibles en " + nombre + " ===");
        for (MaterialBiblioteca m : materiales) {
            if (m.estaDisponible()) {
                m.mostrarInfo();
            }
        }
    }

    public MaterialBiblioteca buscarPorId(int id) {
        for (MaterialBiblioteca m : materiales) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public boolean prestarMaterial(int id) {
        MaterialBiblioteca m = buscarPorId(id);
        if (m != null) {
            m.prestar();
            return true;
        } else {
            System.out.println("No se encontró material con ID " + id);
            return false;
        }
    }

    public boolean devolverMaterial(int id) {
        MaterialBiblioteca m = buscarPorId(id);
        if (m != null) {
            m.devolver();
            return true;
        } else {
            System.out.println("No se encontró material con ID " + id);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nombre +
                " | Cantidad de materiales: " + materiales.size();
    }
}
