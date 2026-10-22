package JuegosPuntos;

import java.util.Scanner;

public class JuegosPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntos = 20;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                puntos = puntos + 20;
                System.out.println("Ganaste 20 puntos.");
            } else if (opcion == 2) {
                // Validar que le alcancen los puntos
                if (puntos >= 15) {
                    puntos = puntos - 15;
                    System.out.println("Gastaste 15 puntos.");
                } else {
                    System.out.println("No tienes suficientes puntos (minimo 15).");
                }
            } else if (opcion == 3) {
                System.out.println("Tus puntos actuales son: " + puntos);
            } else if (opcion == 4) {
                System.out.println("Adios compañero...");
            } else {
                System.out.println("Opción no valida.");
            }
        }

        System.out.println("\nJuego terminado. Puntos restantes: " + puntos);
    }
}