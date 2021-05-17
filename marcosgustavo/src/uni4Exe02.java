import java.util.Scanner;

public class uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor: ");
        int valor = teclado.nextInt();
        if (valor % 2 == 0) {
            System.out.println("O número é Par!");
        } else {
            System.out.println("O número é Ímpar");
        }
        teclado.close();
    }
}
