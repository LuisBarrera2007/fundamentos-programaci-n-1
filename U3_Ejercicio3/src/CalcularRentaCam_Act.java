import java.util.Scanner;

public class CalcularRentaCam_Act {

    // Método 1: Realiza únicamente el cálculo matemático
    public static double calcularRenta(double precioHora, int tiempoHoras) {
        if (precioHora <= 0 || tiempoHoras <= 0) {
            return -1;
        }
        return precioHora * tiempoHoras;
    }

    // Método 2: Método void dedicado exclusivamente a mostrar el resultado
    public static void mostrarComprobante(double montoTotal) {
        System.out.println("\n==================================");
        System.out.println("     COMPROBANTE DE RENTA        ");
        System.out.println("==================================");
        if (montoTotal != -1) {
            System.out.println(" Total a pagar: $" + montoTotal);
        } else {
            System.out.println(" Error: La tarifa y las horas deben ser mayores a cero.");
        }
        System.out.println("==================================\n");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- RENTA DE CÁMARAS AUDIOVISUALES ---");

        System.out.print("Ingrese la tarifa por hora ($): ");
        double costoPorHora = entrada.nextDouble();

        System.out.print("Ingrese el número de horas de uso: ");
        int horasUso = entrada.nextInt();

        // 1. Llamada al método de cálculo
        double resultadoTotal = calcularRenta(costoPorHora, horasUso);

        // 2. Llamada al método para la presentación
        mostrarComprobante(resultadoTotal);

        entrada.close();
    }
}