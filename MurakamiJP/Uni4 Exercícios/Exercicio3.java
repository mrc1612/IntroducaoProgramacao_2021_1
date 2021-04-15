import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int numero1, numero2;

        System.out.println("Informe o número 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Informe o número 2: ");
        numero2 = teclado.nextInt();

        if (numero1>numero2) {
            System.out.println("O número 1 = "+numero1+", é maior que o número 2 = "+numero2+"");
        }else{
            System.out.println("O número 1 = "+numero2+", é maior que o número 2 = "+numero1+"");
        }
        
        teclado.close();
    }
}