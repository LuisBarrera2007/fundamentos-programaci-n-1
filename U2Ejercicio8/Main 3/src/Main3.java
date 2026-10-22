import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en °C: ");
        double temp = sc.nextDouble();

        if (temp < 10) {
            System.out.println("Frío extremo");
        } else if (temp <= 20) {
            System.out.println("Clima fresco");
        } else if (temp <= 30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }

        sc.close();
    }
}