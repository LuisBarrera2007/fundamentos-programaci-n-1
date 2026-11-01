import java.util.Scanner;

public class SimuladorBateria_Act {

    // Método que simula el tiempo de carga con un ciclo while
    public static int calcularMinutos(int porcentajeInicial) {
        int cargaActual = porcentajeInicial;
        int minutosContador = 0;

        while (cargaActual < 100) {
            cargaActual += 8;
            minutosContador++;
        }

        return minutosContador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuestaMenu;

        // Ciclo do-while para permitir múltiples simulaciones
        do {
            System.out.println("=== SIMULADOR DE CARGA DE BATERÍA ===");
            System.out.print("Ingrese el porcentaje inicial de la batería (0 a 100): ");
            int nivelBateria = teclado.nextInt();

            // Validación de rango
            if (nivelBateria >= 0 && nivelBateria <= 100) {
                int tiempoNecesario = calcularMinutos(nivelBateria);
                System.out.println("\n----------------------------------------");
                System.out.println("Tiempo necesario para llegar al 100%: " + tiempoNecesario + " minutos.");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("\nError: El porcentaje ingresado no es válido. Debe ser entre 0 y 100.");
            }

            // Opción para repetir el programa
            System.out.print("\n¿Desea realizar otra simulación? (s/n): ");
            respuestaMenu = teclado.next().toLowerCase().charAt(0);
            System.out.println();

        } while (respuestaMenu == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
        teclado.close();
    }
}