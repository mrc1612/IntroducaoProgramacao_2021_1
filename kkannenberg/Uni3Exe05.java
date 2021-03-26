import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Infome quantos frangos possui na granja");
        int frango = sc.nextInt();


        int anelIden = 4;
        double anelAlime = 3.5;


        double resultado = (anelIden + (anelAlime * 2));

        double total = frango * resultado;


        System.out.println("O gasto total da granja é de R$:"+total);

        sc.close();

    }
}
