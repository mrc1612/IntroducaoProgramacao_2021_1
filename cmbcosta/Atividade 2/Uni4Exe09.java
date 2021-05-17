import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor 1");

        double valor = scanner.nextDouble();

        System.out.println("Digite o valor 2");

        double valor1 = scanner.nextDouble();

        if((valor % valor1 == 0) || (valor1 % valor == 0)){
            System.out.println("valor é Múltiplo");
        }else{
            System.out.println("valor não é Múltiplo");
        }

        scanner.close();
    }
}