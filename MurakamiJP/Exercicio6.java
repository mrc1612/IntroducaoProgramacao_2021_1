import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Restaure e Churrascaria Do Japa $ 25 QUILO $ ");
        System.out.print("\n");
        
        System.out.print("Informe o peso do prato montado do cliente: ");
        float peso_prato = teclado.nextFloat();

        System.out.println("Valor total do prato: R$ " + ((peso_prato - 0.750) * 25));

        teclado.close();
    }
}