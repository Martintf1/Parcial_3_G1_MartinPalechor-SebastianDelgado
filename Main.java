import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEstudiante gestionEstudiante = new GestionEstudiante(5);

        byte opcion;
        do {
            System.out.println("\t\tMENU GESTION ESTUDIANTES");
            System.out.println("1. Agregra estudiante: ");
            System.out.println("2. Mostrar todos los estudiante: ");
            System.out.println("3. Buscar estudiantes por nombre: ");
            System.out.println("4. Calcular promedio general: ");
            System.out.println("5. Salir: ");
            System.out.print("Digite una opcion: ");

            opcion = scanner.nextByte();

            switch (opcion){
                case 1:

                    scanner.nextLine();
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Ingrese Edad del estudiante: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese Promedio del estudiante: ");
                    double promedio = scanner.nextDouble();
                    Estudiante estudiante = new Estudiante(nombres,edad,promedio);
                    gestionEstudiante.agregarEtudiante(estudiante);
                    break;

                case 2:
                        gestionEstudiante.mostrarEstudiantes();
                    break;
                case 3:
                        scanner.nextLine();
                        System.out.print("Ingrese nombre de estudiante que quiere buscar: ");
                        String nombre = scanner.nextLine();
                        gestionEstudiante.mostrarPorNombre(nombre);
                    break;
                case 4:
                    System.out.println("El promedio general es: "+gestionEstudiante.calcularpRromedioGeneral());
                    break;
                case 5:
                    System.out.println("saliendo.........");
                    break;
                default:
                    System.out.println("digite otra opcion valida:");
                    break;
            }

        }while (opcion!=5);
    }
}