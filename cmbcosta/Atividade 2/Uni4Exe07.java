import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Peso da carta em gramas ?");

        double peso = scanner.nextDouble();
        double maior50G = 50; 




        if(peso > 50){

         double valorExtra = peso - maior50G;
         
         if(valorExtra >= 20){
            valorExtra = valorExtra / 20;
            double valorTotal = valorExtra * 0.45 + 0.45;
            System.out.println("Custo do celo: R$" + valorTotal);
         }

        }else{
            System.out.println("Custo do celo: R$0,45");
         }


        scanner.close();
    }
}