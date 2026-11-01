import java.util.Scanner;

public class GeneradorPaquetes_Act {

    // Método void solicitado por las instrucciones
    public static void mostrarEtiqueta(String codigoRastreo, String destinoFinal, double pesoMasa) {
        System.out.println("==================================");
        System.out.println("       ETIQUETA DE ENVÍO          ");
        System.out.println("==================================");
        System.out.println(" Guía N°    : " + codigoRastreo);
        System.out.println(" Destino    : " + destinoFinal);
        System.out.println(" Peso (kg)  : " + pesoMasa + " kg");
        System.out.println("==================================\n");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Prueba 1
        System.out.println("--- DATOS DEL PAQUETE 1 ---");
        System.out.print("Ingrese número de guía: ");
        String guia1 = teclado.nextLine();
        System.out.print("Ingrese ciudad de destino: ");
        String destino1 = teclado.nextLine();
        System.out.print("Ingrese peso en kg: ");
        double peso1 = teclado.nextDouble();
        teclado.nextLine(); // Limpiar búfer

        // Mostrar primera etiqueta
        mostrarEtiqueta(guia1, destino1, peso1);

        // Prueba 2
        System.out.println("--- DATOS DEL PAQUETE 2 ---");
        System.out.print("Ingrese número de guía: ");
        String guia2 = teclado.nextLine();
        System.out.print("Ingrese ciudad de destino: ");
        String destino2 = teclado.nextLine();
        System.out.print("Ingrese peso en kg: ");
        double peso2 = teclado.nextDouble();

        // Mostrar segunda etiqueta
        mostrarEtiqueta(guia2, destino2, peso2);

        teclado.close();
    }
}