import java.util.Scanner;

public class Unid4Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int n1 = teclado.nextInt();
        System.out.print("Informe o segundo valor: ");
        double n2 = teclado.nextInt();
        if (n2 % n1 == 0 || n1 % n2 == 0) {
            System.out.println("Os números são múltiplos.");
        }
        else {
            System.out.println("Os números não são múltiplos.");
        }   
    }   
}