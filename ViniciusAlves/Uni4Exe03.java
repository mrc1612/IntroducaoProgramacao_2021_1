import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println(+num1+" É o maior número ");
        } else if (num2 > num1) { 
            System.out.println(+num2+" É o maior número ");
        } else {
            System.out.println(" Os números são iguais ");
        }

    }
}