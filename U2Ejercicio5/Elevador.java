import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int actual = 0;
        int deseado = 0;

        // Validar que el piso actual no sea 0 ni negativo
        while (actual <= 0) {
            System.out.print("Piso actual: ");
            actual = sc.nextInt();
            if (actual <= 0) {
                System.out.println("No se admiten pisos menores o iguales a 0.");
            }
        }

        // Validar que el piso deseado no sea 0, ni negativo, ni igual al actual
        while (deseado <= 0 || deseado == actual) {
            System.out.print("Piso deseado: ");
            deseado = sc.nextInt();
            if (deseado <= 0) {
                System.out.println("No se admiten pisos menores o iguales a 0.");
            } else if (deseado == actual) {
                System.out.println("El piso deseado no puede ser igual al actual.");
            }
        }

        System.out.println("Salida:");

        // Imprimir el recorrido si va subiendo
        if (actual < deseado) {
            int piso = actual + 1;
            while (piso <= deseado) {
                System.out.println(piso);
                piso++;
            }
        }
        // Imprimir el recorrido si va bajando
        else {
            int piso = actual - 1;
            while (piso >= deseado) {
                System.out.println(piso);
                piso--;
            }
        }

    }
}