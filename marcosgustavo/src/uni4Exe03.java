import java.util.Scanner;

public class uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um número: ");
        int numero = teclado.nextInt();
        System.out.println("digite outro número: ");
        int numero2 = teclado.nextInt();

        if (numero >= numero2) {
            System.out.println("o maior número é: "+numero);
        } else {
            System.out.println("o maior número é: "+numero2);
        }
        teclado.close();
    }
}
