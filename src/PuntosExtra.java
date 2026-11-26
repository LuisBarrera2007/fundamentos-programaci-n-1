public class PuntosExtra {

    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        System.out.println("Lista inicial de calificaciones:");
        imprimirLista(calificaciones);

        sumarPuntos(calificaciones);

        System.out.println("\nLista con curva aplicada:");
        imprimirLista(calificaciones);

        mostrarTotalAprobados(calificaciones);
    }

    public static void imprimirLista(int[] notas) {
        int numAlumno = 1;
        for (int nota : notas) {
            System.out.println("Alumno " + numAlumno + ": " + nota);
            numAlumno++;
        }
    }

    public static void sumarPuntos(int[] notas) {
        for (int pos = 0; pos < notas.length; pos++) {
            notas[pos] += 5;
            if (notas[pos] >= 100) {
                notas[pos] = 100;
            }
        }
    }

    public static void mostrarTotalAprobados(int[] notas) {
        int aprobados = 0;
        for (int pos = 0; pos < notas.length; pos++) {
            if (notas[pos] >= 70) {
                aprobados++;
            }
        }
        System.out.println("\nTotal de alumnos aprobados: " + aprobados);
    }
}