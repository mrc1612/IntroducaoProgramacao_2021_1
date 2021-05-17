import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        
        int numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe um número");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
        sc.close();
    }
}
