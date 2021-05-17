import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double num;

        System.out.println("Infome o num:");
        num = teclado.nextDouble();

        if (num%2 == 0){
            System.out.println("Seu numero " + num + " e par");
        } else{
            System.out.println("Seu numero " + num + " e impar");
        }

        teclado.close();
    }
}