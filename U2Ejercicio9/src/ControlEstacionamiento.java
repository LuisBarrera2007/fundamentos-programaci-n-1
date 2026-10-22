import java.util.Scanner;

public class ControlEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAutos = 0;
        int autosConDescuento = 0;
        double totalRecaudado = 0;

        System.out.print("Ingresa las horas (0 para terminar): ");
        int horas = sc.nextInt();

        while (horas != 0) {
            if (horas < 0) {
                System.out.println("Las horas no pueden ser negativas.");
            } else {
                double pago = horas * 15;

                if (horas > 5) {
                    pago -= 10;
                    autosConDescuento++;
                }

                totalAutos++;
                totalRecaudado += pago;

                System.out.println("Vas a pagar por este auto: $" + pago);
            }

            System.out.print("\nIngresa horas (0 para terminar): ");
            horas = sc.nextInt();
        }

        System.out.println("\n--- RESUMEN DEL DÍA ---");
        System.out.println("Autos atendidos: " + totalAutos);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("Autos con descuento: " + autosConDescuento);

        if (totalAutos > 0) {
            double promedio = totalRecaudado / totalAutos;
            System.out.println("Promedio pagado: $" + promedio);
        } else {
            System.out.println("No se registraron autos.");
        }

        sc.close();
    }
}