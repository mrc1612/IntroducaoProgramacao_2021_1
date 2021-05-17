import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Digite o primeiro número: ");
        System.out.println("Digite o segundo número: ");

        int num1 = tec.nextInt();
        int num2 = tec.nextInt();

        //Processo
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        }
        else {
            System.out.println("O maior número é: " + num2);
        }

        tec.close();
    }
}
