import java.util.Scanner;

public class ControlPartidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, masMil = 0, milOMenos = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Puntuación partida " + i + ": ");
            int pts = sc.nextInt();
            total += pts;
            if (pts > 1000) masMil++; else milOMenos++;
        }

        System.out.println("\nTotal: " + total);
        System.out.println("Promedio: " + (total / 7.0));
        System.out.println("Más de 1000: " + masMil);
        System.out.println("1000 o menos: " + milOMenos);
    }
}