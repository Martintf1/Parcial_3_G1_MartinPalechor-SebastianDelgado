

public class GestionEstudiante {
    private Estudiante [] estudiantes;
    private int cantidadActual;
    private int capacidadMax;

    public GestionEstudiante(int capacidadMax) {
        estudiantes = new Estudiante[capacidadMax];
        cantidadActual = 0;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void agregarEtudiante(Estudiante estudiante) {
        if (capacidadMax < estudiantes.length) {
            estudiantes[cantidadActual++] = estudiante;

        } else {
            System.out.println("No se pueden agregar mas estudiantes");
        }
    }

    public void mostrarEstudiantes(){
        for (int i = 0; i < cantidadActual; i++){
            System.out.println(estudiantes[i]);
        }
    }

    public void mostrarPorNombre(String nombre) {
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(estudiantes[i]);
            }
        }
    }
    public double calcularpRromedioGeneral(){
        double promedio = 0;
        for (int i =0; i<cantidadActual ; i++){
            promedio += estudiantes[i].getPromedio();
        }
        return promedio/cantidadActual;
    }
}
