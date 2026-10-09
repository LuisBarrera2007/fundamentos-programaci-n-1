package Main.Java;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Renta de Bicicletas ---");
        System.out.println("1. Urbana ($20/hr)");
        System.out.println("2. Montaña ($35/hr)");
        System.out.println("3. Eléctrica ($50/hr)");
        System.out.print("Ingresa el tipo de bicicleta (1-3): ");
        int tipoBici = sc.nextInt();

        double tarifaHora = 0;
        String nombreTipo = "";
        boolean opcionValida = true;

        // 1. Switch para determinar la tarifa según el tipo
        switch (tipoBici) {
            case 1:
                nombreTipo = "Urbana";
                tarifaHora = 20.0;
                break;
            case 2:
                nombreTipo = "Montaña";
                tarifaHora = 35.0;
                break;
            case 3:
                nombreTipo = "Eléctrica";
                tarifaHora = 50.0;
                break;
            default:
                opcionValida = false;
                break;
        }

        // Decisión anidada 1: Verifica si la opción del menú existe
        if (opcionValida) {
            System.out.print("Ingresa las horas de renta: ");
            int horas = sc.nextInt();

            // Decisión anidada 2: Verifica que las horas sean mayores a cero
            if (horas > 0) {
                System.out.print("¿Cuenta con membresía? (true/false): ");
                boolean tieneMembresia = sc.nextBoolean();

                // 4. Cálculo del subtotal
                double subtotal = tarifaHora * horas;
                double descuento = 0;

                // 5. Aplicación del 20% de descuento con membresía
                if (tieneMembresia) {
                    descuento = subtotal * 0.20;
                }

                double total = subtotal - descuento;

                // 6. Imprimir resumen final
                System.out.println("\n--- RESUMEN DE RENTA ---");
                System.out.println("Tipo de bicicleta: " + nombreTipo);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento (20%): $" + descuento);
                System.out.println("Total a pagar: $" + total);

            } else {
                System.out.println("Error: Las horas de renta deben ser mayores a cero.");
            }
        } else {
            // 2. Mensaje si la opción no existe
            System.out.println("Opción no válida");
        }

        sc.close();
    }
}