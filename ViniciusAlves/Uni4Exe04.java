import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double numero;

        System.out.println("Informe um número: ");
        numero = teclado.nextDouble();

        if (numero/1 == numero) {
            System.out.println("O número inserido contém casas decimais. ");
        } else {
            System.out.println("O número inserido não contém casas decimais. ");
        }
 
        teclado.close();
    }
}