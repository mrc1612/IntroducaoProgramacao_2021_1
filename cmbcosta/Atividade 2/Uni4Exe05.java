import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = scanner.nextBoolean();

        if(resposta){
            System.out.println("True");
        } else {
            System.out.println("False");
        }



        scanner.close();
    }
}