import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio5 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        DecimalFormat reais = new DecimalFormat("0.00");

        float valor_total;
        

        System.out.print("Granja Do Japa");
        System.out.print("\n");
        
        System.out.print("Informe a quantidade de frangos na granja: ");
        int quantidade_frangos = teclado.nextInt();

        valor_total = quantidade_frangos * 11;
    
        System.out.println("Preço total dos chips: R$ " + reais.format(valor_total));
        
        teclado.close();
    }
}
