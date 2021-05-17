import java.util.Scanner;

public class Uni4Ex03 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Informe o primeiro número: ");
       double n1 = teclado.nextDouble();
       System.out.print("Informe o segundo número: ");
       double n2 = teclado.nextDouble();
       if (n1 > n2) {
           System.out.println("O número " + n1 + " é maior do que " + n2);
       }
       else if (n1 == n2) {
           System.out.println("Os números são iguais.");
       }
       else {
           System.out.println("O número " + n2 + " é maior do que " + n1);
       }
       teclado.close();
    }
}
