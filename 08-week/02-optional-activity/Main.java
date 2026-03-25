import java.util.Scanner;

class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Nodo cabeza = null;
        Nodo actual = null;

        // Ingresar datos
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            String nombre = sc.nextLine();

            Nodo nuevo = new Nodo(nombre);

            if (cabeza == null) {
                cabeza = nuevo;
                actual = nuevo;
            } else {
                actual.siguiente = nuevo;
                actual = nuevo;
            }
        }

        // Mostrar tabla
        System.out.println("\nTABLA DE ESTUDIANTES");
        System.out.println("+----+----------------------+----------------------+");
        System.out.println("| #  | Nombre               | Siguiente            |");
        System.out.println("+----+----------------------+----------------------+");

        Nodo temp = cabeza;
        int i = 1;

        while (temp != null) {
            String sig = (temp.siguiente != null) ? temp.siguiente.nombre : "null";
            System.out.printf("| %-2d | %-20s | %-20s |\n", i, temp.nombre, sig);
            temp = temp.siguiente;
            i++;
        }

        System.out.println("+----+----------------------+----------------------+");

        // Explicación final
        System.out.println("\n¿Por qué es una estructura dinámica?");
        System.out.println("Una lista enlazada es dinámica porque su tamaño puede cambiar en ejecución.");
        System.out.println("Los nodos se crean cuando se necesitan, sin tamaño fijo.");
        System.out.println("Cada nodo apunta al siguiente, facilitando inserciones y eliminaciones.");
        System.out.println("No es necesario mover datos como en arreglos.");
        System.out.println("Esto la hace flexible y eficiente.");

        sc.close();
    }
}