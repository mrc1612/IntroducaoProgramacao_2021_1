import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        numero1 = sc.nextInt();
        System.out.println("Informe outro número");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os números são iguais");
        }
        sc.close();
    }
}
