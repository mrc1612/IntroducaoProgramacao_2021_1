import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o peso do prato");
        double peso = sc.nextDouble();

        int pesoKG = 25;
        double prato = 750/1000;

        double valorTotal = pesoKG * peso - prato;

        System.out.println("O valor total a ser pago é de R$"+valorTotal);

        sc.close();

    }
}
