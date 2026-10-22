import java.util.Scanner;

public class CalcularTarifasAutos {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        // Variables con nombres propios y distintivos
        int carrosAtendidos = 0;
        int autosBeneficiados = 0;
        double acumuladoDinero = 0;

        System.out.println("=== REGISTRO DE PARQUEADERO ===");
        System.out.print("Ingrese horas de estancia (0 para finalizar): ");
        int tiempoHoras = captura.nextInt();

        while (tiempoHoras != 0) {
            if (tiempoHoras < 0) {
                System.out.println("-> Error: La cifra de horas no puede ser negativa.");
            } else {
                double cobroIndividual = tiempoHoras * 15;

                // Descuento por exceder las 5 horas
                if (tiempoHoras > 5) {
                    cobroIndividual -= 10;
                    autosBeneficiados++;
                }

                carrosAtendidos++;
                acumuladoDinero += cobroIndividual;

                System.out.println("Monto a pagar: $" + cobroIndividual);
            }

            System.out.print("\nIngrese horas de estancia (0 para finalizar): ");
            tiempoHoras = captura.nextInt();
        }

        // Impresión de resultados al cerrar la sesión
        System.out.println("\n--------------------------------");
        System.out.println("        REPORTE FINAL           ");
        System.out.println("--------------------------------");
        System.out.println("Vehículos procesados : " + carrosAtendidos);
        System.out.println("Recaudación del día  : $" + acumuladoDinero);
        System.out.println("Autos con descuento  : " + autosBeneficiados);

        if (carrosAtendidos > 0) {
            double cuotaPromedio = acumuladoDinero / carrosAtendidos;
            System.out.println("Promedio por cliente : $" + cuotaPromedio);
        } else {
            System.out.println("No se registró actividad en la jornada.");
        }

        captura.close();
    }
}