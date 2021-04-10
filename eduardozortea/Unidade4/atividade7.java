package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoEmGramas = scanner.nextDouble();

        if(pesoEmGramas <= 50){
            System.out.println("custo do celo: R$0,45");
        }
        else{
            double pesoExtra = (pesoEmGramas - 50);
            if(pesoExtra >= 20){
                double precoExtra = pesoExtra / 20;
                double preco = precoExtra * 0.45 + 0.45;
                System.out.println("custo do celo: R$" + preco);
            }
            else{
                System.out.println("custo do celo: R$0,45");
            }
         }
        scanner.close();
    }
}
