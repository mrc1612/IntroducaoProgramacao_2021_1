import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço por litro da gasolina");
        float gasolina = sc.nextFloat();
        System.out.println("Infome o valor que deseja pagar");
        float valor = sc.nextFloat();

        float resultado = valor / gasolina;

        System.out.println("O preço por litro da gasolina é de R$" + gasolina);
        System.out.println("O valor do pagamento é de R$" + valor);
        System.out.println("Foram abastecidos " + resultado + " litros em seu veículo");







        sc.close();
        
    }
}
