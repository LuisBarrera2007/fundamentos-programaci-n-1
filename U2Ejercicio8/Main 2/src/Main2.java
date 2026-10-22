import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de asistencia (0-100): ");
        double asistencia = sc.nextDouble();

        // Evaluamos las condiciones
        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else if (asistencia < 80.0) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }

        sc.close();
    }
}