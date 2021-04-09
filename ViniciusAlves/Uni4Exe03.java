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
            System.out.println(+num1+" É maior que "+num2);
        } else {
            System.out.println(+num2+" É maior que "+num1);
        }

    }
}