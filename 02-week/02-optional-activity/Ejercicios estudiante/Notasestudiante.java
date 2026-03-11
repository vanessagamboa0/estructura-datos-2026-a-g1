import java.util.Scanner;

public class NotasEstudiante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;

        System.out.println("=== Registro de Notas del Estudiante ===");

        // Ingresar notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Mostrar notas
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            suma += notas[i];
        }

        // Calcular promedio
        double promedio = suma / notas.length;

        System.out.println("\nPromedio final: " + promedio);

        // Verificar si aprobó
        if (promedio >= 3.0) {
            System.out.println("Resultado: El estudiante APROBÓ.");
        } else {
            System.out.println("Resultado: El estudiante REPROBÓ.");
        }

        scanner.close();
    }
}