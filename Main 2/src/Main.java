import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double subtotal=0;
        double descuento=0;
        double total=0;
        double horas=0;




        System.out.print("Dime tu tipo de bicicleta \n1. Bicicleta urbana: $40 por hora\n2. Bicicleta de montaña: $60 por hora\n3. Bicicleta eléctrica: $90 por hora\n:");
        int bici= teclado.nextInt();

        switch (bici){
            case 1:
                System.out.print("");
                System.out.print("Dime el numero de horas: ");
                horas=teclado.nextInt();

                if(horas>0){
                    subtotal=40*horas;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        descuento=subtotal*.20;
                        total=subtotal-descuento;
                    }else{
                        total=subtotal-descuento;
                    }
                }else{
                    System.out.print("No ocupaste la bicicleta :(");
                }
                System.out.print("Bicicleta urbana\nSubtotal: "+subtotal+"\nDescuento: "+descuento+"\nTotal: "+total);

                break;
            case 2:

                System.out.print("Dime el numero de horas: ");
                horas=teclado.nextInt();

                if(horas>0){
                    subtotal=60*horas;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        descuento=subtotal*.20;
                        total=subtotal-descuento;
                    }else{
                        total=subtotal-descuento;
                    }
                }else{
                    System.out.print("No ocupaste la bicicleta :(");
                }
                System.out.print("Bicicleta montaña\nSubtotal: "+subtotal+"\nDescuento: "+descuento+"\nTotal: "+total);


                break;
            case 3:

                System.out.print("Dime el numero de horas: ");
                horas=teclado.nextInt();

                if(horas>0){
                    subtotal=90*horas;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        descuento=subtotal*.20;
                        total=subtotal-descuento;
                    }else{
                        total=subtotal-descuento;
                    }
                }else{
                    System.out.print("No ocupaste la bicicleta :(");
                }
                System.out.print("Bicicleta electrica\nSubtotal: "+subtotal+"\nDescuento: "+descuento+"\nTotal: "+total);


                break;
            default:

                System.out.print("Opcion no valida ;(");

                break;

        }





    }
}
