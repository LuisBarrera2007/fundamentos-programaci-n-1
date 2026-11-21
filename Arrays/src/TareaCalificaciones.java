import java.util.Scanner;

public class TareaCalificaciones {

    public static void main(String[] args) {

        int[] lasCalifs = pedirNotas();

        System.out.println("\nCalificaciones capturadas:");
        imprimirLista(lasCalifs);

        int pasaron = checarAprobados(lasCalifs);
        int tronaron = checarReprobados(lasCalifs);

        System.out.println("\nAlumnos aprobados: " + pasaron);
        System.out.println("Alumnos reprobados: " + tronaron);
    }

    public static int[] pedirNotas() {
        Scanner teclado = new Scanner(System.in);
        int[] cajitaNotas = new int[10];
        int datoIngresado = 0;

        for (int k = 0; k < cajitaNotas.length; k++) {
            boolean estaBien = false;


            while (!estaBien) {
                System.out.print("Captura la calificación del alumno " + (k + 1) + ": ");
                datoIngresado = teclado.nextInt();

                if (datoIngresado >= 0 && datoIngresado <= 100) {
                    cajitaNotas[k] = datoIngresado;
                    estaBien = true;
                } else {
                    System.out.println("Esa calificacion no vale, tiene que ser de 0 a 100. Intenta otra vez.");
                }
            }
        }
        return cajitaNotas;
    }

    public static void imprimirLista(int[] arregloNotas) {
        for (int x = 0; x < arregloNotas.length; x++) {
            System.out.println("Alumno " + (x + 1) + ": " + arregloNotas[x]);
        }
    }

    public static int checarAprobados(int[] lista) {
        int contAprob = 0;
        for (int pos = 0; pos < lista.length; pos++) {
            if (lista[pos] >= 70) {
                contAprob++;
            }
        }
        return contAprob;
    }

    public static int checarReprobados(int[] lista) {
        int contReprob = 0;
        for (int pos = 0; pos < lista.length; pos++) {
            if (lista[pos] < 70) {
                contReprob = contReprob + 1;
            }
        }
        return contReprob;
    }
}