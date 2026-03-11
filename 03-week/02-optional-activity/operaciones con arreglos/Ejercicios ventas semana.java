
class VentasSemana {
    public static void main(String[] args) {

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[] ventas = {120, 85, 150, 95, 200, 175, 90};

        int total = 0;
        int mayor = ventas[0];
        int menor = ventas[0];
        int diaMayor = 0;
        int diaMenor = 0;
        int contador = 0;

        System.out.println("Ventas de la semana:");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println(dias[i] + ": " + ventas[i]);
            total += ventas[i];

            if (ventas[i] > mayor) {
                mayor = ventas[i];
                diaMayor = i;
            }

            if (ventas[i] < menor) {
                menor = ventas[i];
                diaMenor = i;
            }

            if (ventas[i] > 100) {
                contador++;
            }
        }

        double promedio = (double) total / ventas.length;

        System.out.println("
Total de ventas: " + total);
        System.out.println("Promedio de ventas: " + promedio);
        System.out.println("Venta más alta: " + mayor + " (" + dias[diaMayor] + ")");
        System.out.println("Venta más baja: " + menor + " (" + dias[diaMenor] + ")");
        System.out.println("Días con ventas mayores a 100: " + contador);
    }
}
