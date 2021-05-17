import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um Número1 : " );
        double Numero = teclado.nextDouble();
        System.out.println("Informe um Número2 : " );
        double Numero2 = teclado.nextDouble();
        if(Numero > Numero2){
            System.out.println("Número 1 é maior ");
        } else{
            System.out.println("Número 2 é maior");
        }




        teclado.close();
    }
}