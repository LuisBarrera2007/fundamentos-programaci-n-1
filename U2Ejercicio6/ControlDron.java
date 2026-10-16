import java.util.Scanner;

public class ControlDron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batería inicial: ");
        int bateria = sc.nextInt();

        int minuto = 1;

        System.out.println();

        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        sc.close();
    }
}
