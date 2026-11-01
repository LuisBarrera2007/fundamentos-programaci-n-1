import java.util.Scanner;

public class EstimadorDescargas_Act {

    // Método que calcula el tiempo y retorna el resultado
    public static double calcularTiempo(double tamanoMB, double velocidadMBs) {
        // Validación de entradas
        if (tamanoMB < 0 || velocidadMBs <= 0) {
            return -1; // Retorno de control en caso de datos inválidos
        }
        return tamanoMB / velocidadMBs;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE TIEMPO DE DESCARGA ===");

        System.out.print("Ingrese el tamaño del archivo (MB): ");
        double pesoArchivo = lector.nextDouble();

        System.out.print("Ingrese la velocidad de descarga (MB/s): ");
        double tasaTransferencia = lector.nextDouble();

        // Se guarda el retorno del método
        double tiempoSegundos = calcularTiempo(pesoArchivo, tasaTransferencia);

        System.out.println("\n----------------------------------------");
        if (tiempoSegundos != -1) {
            System.out.println("Tiempo estimado de descarga: " + tiempoSegundos + " segundos.");
        } else {
            System.out.println("Error: El tamaño no puede ser negativo y la velocidad debe ser mayor a cero.");
        }
        System.out.println("----------------------------------------");

        lector.close();
    }
}