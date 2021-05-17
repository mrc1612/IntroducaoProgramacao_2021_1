import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Informe outro número: ");
        int numero2 = teclado.nextInt();

        if ((numero2 % numero1) == 0) {
            System.out.println("É multiplo");
        } else {
            System.out.println("Não é multiplo");
        }

        teclado.close();

    }    
}
