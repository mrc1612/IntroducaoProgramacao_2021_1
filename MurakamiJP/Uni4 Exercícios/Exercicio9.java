import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int n1, n2;

        System.out.println("Informe o primeiro número: ");
        n1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        n2 = teclado.nextInt();

        if(n1 % n2 == 0||n2 % n1 == 0) {
            System.out.println("Os números são multiplos");
        }
        else {
            System.out.println("Os números não são multiplos");
        }
        
        teclado.close();
    }
    
}
