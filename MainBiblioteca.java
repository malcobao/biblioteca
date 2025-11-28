package biblioteca;

import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Libro libro1 = new Libro(1, "El Señor de los Anillos", "J.R.R. Tolkien", 1954,
                1200, "Fantasía");
        Libro libro2 = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", 1967,
                430, "Realismo mágico");

        Revista revista1 = new Revista(3, "National Geographic", "Varios", 2024,
                340, "Marzo");

        Periodico periodico1 = new Periodico(4, "La Razón", "Varios", 2025,
                "15-10-2025");

        Tesis tesis1 = new Tesis(5, "Optimización de Redes", "Juan Pérez", 2022,
                "UMSA", "Ingeniería de Sistemas", "Dr. Rodríguez");

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(libro2);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(periodico1);
        biblioteca.agregarMaterial(tesis1);

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        System.out.println("======================================");
        System.out.println("      SISTEMA DE BIBLIOTECA");
        System.out.println("======================================");

        while (opcion != 0) {
            System.out.println();
            System.out.println("Menú:");
            System.out.println("1. Listar todos los materiales");
            System.out.println("2. Listar materiales disponibles");
            System.out.println("3. Prestar material por ID");
            System.out.println("4. Devolver material por ID");
            System.out.println("5. Buscar material por ID");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                scanner.nextLine(); 
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println();

            switch (opcion) {
                case 1:
                    biblioteca.listarTodos();
                    break;
                case 2:
                    biblioteca.listarDisponibles();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del material a prestar: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("ID inválido.");
                        scanner.nextLine();
                    } else {
                        int idPrestar = scanner.nextInt();
                        scanner.nextLine();
                        biblioteca.prestarMaterial(idPrestar);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del material a devolver: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("ID inválido.");
                        scanner.nextLine();
                    } else {
                        int idDevolver = scanner.nextInt();
                        scanner.nextLine();
                        biblioteca.devolverMaterial(idDevolver);
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el ID a buscar: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("ID inválido.");
                        scanner.nextLine();
                    } else {
                        int idBuscar = scanner.nextInt();
                        scanner.nextLine();
                        MaterialBiblioteca encontrado = biblioteca.buscarPorId(idBuscar);
                        if (encontrado != null) {
                            System.out.println("Material encontrado:");
                            encontrado.mostrarInfo();
                        } else {
                            System.out.println("No se encontró material con ID " + idBuscar);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
