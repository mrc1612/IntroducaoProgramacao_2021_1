import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int n1, n2;

        System.out.println("Informe o primeiro número: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Informe o segundo número: ");
        numero2 = teclado.nextInt();

        if(n1>n2) {
            System.out.println("O número 1 é maior que o número 2);
        
        }else{
            System.out.println("O número 1 é menor que o número 2);
        }
        
        teclado.close();
    }
}
