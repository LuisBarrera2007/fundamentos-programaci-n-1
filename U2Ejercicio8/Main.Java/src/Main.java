import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos de la matriz 2x2
        System.out.print("Ingrese el elemento (1,1): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el elemento (1,2): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el elemento (2,1): ");
        double c = scanner.nextDouble();

        System.out.print("Ingrese el elemento (2,2): ");
        double d = scanner.nextDouble();

        // Calcular el determinante (ad - bc)
        double det = (a * d) - (b * c);

        // Mostrar el resultado
        System.out.println("\nMatriz:");
        System.out.println("[ " + a + "  " + b + " ]");
        System.out.println("[ " + c + "  " + d + " ]");

        System.out.println("\nEl determinante es: " + det);

        scanner.close();
    }
}