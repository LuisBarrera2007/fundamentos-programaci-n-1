import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int existencias = 100;
        int capacidadMaxima = 250;
        int recepcionesExitosas = 0;
        int retirosExitosos = 0;
        int operacionesRechazadas = 0;
        int totalUnidadesRecibidas = 0;
        int totalUnidadesRetiradas = 0;
        int opcion = 0;

        do {
            System.out.println("MENU DE OPERACIONES");
            System.out.println("1. Recibir");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                switch (opcion) {
                    case 1:
                        int unidadesRecibir = 0;
                        do {
                            System.out.print("Dime cuanto vas a recibir: ");
                            unidadesRecibir = teclado.nextInt();
                            if (unidadesRecibir <= 0) {
                                System.out.println("La cantidad es 0 o negativa, volver a solicitarla.");
                            }
                        } while (unidadesRecibir <= 0);

                        if (existencias + unidadesRecibir > capacidadMaxima) {
                            System.out.println("Capacidad excedida");
                            operacionesRechazadas++;
                        } else {
                            existencias += unidadesRecibir;
                            recepcionesExitosas++;
                            totalUnidadesRecibidas += unidadesRecibir;

                            if (existencias < 30) {
                                System.out.println("Inventario bajo");
                            }
                        }
                        break;

                    case 2:
                        int unidadesRetirar = 0;
                        do {
                            System.out.print("Dime cuanto vas a retirar: ");
                            unidadesRetirar = teclado.nextInt();
                            if (unidadesRetirar <= 0) {
                                System.out.println("La cantidad es 0 o negativa, volver a solicitarla.");
                            }
                        } while (unidadesRetirar <= 0);

                        if (unidadesRetirar > existencias) {
                            System.out.println("Existencias insuficientes");
                            operacionesRechazadas++;
                        } else {
                            existencias -= unidadesRetirar;
                            retirosExitosos++;
                            totalUnidadesRetiradas += unidadesRetirar;

                            if (existencias < 30) {
                                System.out.println("Inventario bajo");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Existencias actuales: " + existencias);
                        break;

                    case 4:
                        System.out.println("REPORTE FINAL");
                        System.out.println("Existencias finales: " + existencias);
                        System.out.println("Total de unidades recibidas: " + totalUnidadesRecibidas);
                        System.out.println("Total de unidades retiradas: " + totalUnidadesRetiradas);
                        System.out.println("Recepciones exitosas: " + recepcionesExitosas);
                        System.out.println("Retiros exitosos: " + retirosExitosos);
                        System.out.println("Operaciones rechazadas: " + operacionesRechazadas);
                        break;
                }
            } else {
                System.out.println("Opcion invalida, seleccione una opcion del 1 al 4");
            }

        } while (opcion != 4);
    }
}