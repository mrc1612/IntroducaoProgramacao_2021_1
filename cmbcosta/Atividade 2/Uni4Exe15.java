import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Dígite os Meses Trabalhados: ");

        double mesesTrabalhados = scanner.nextDouble();

        if(mesesTrabalhados >= 1 && mesesTrabalhados <= 12){
            System.out.println("O valor de reajuste do seu salário é de 5%");
        }else if(mesesTrabalhados >= 13 && mesesTrabalhados <= 48) {
            System.out.println("O valor de reajuste do seu salário é de 7%");
        }

        scanner.close();
    }
}