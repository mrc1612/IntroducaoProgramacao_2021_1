import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int num_1, num_2;

        System.out.println("Informe o primeiro numero: ");
        num_1 = teclado.nextInt();
        System.out.println("Informe o segundo numero: ");
        num_2 = teclado.nextInt();

        if (num_1 > num_2) {
            System.out.println("O numero 1 = " + num_1 +", e maior que o numero 2 = " + num_2 + "");
        }else{
            System.out.println("O numero 2 = " + num_2 + ", e maior que o numero 2 = " + num_1 +"");
        }
        
        teclado.close();
    }
}