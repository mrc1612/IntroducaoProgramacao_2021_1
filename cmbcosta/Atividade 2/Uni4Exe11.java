import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ano de Nascimento Primeiro Filho");

        double anoPrimeiroFilho = scanner.nextDouble();

        System.out.println("Ano de Nascimento Segundo Filho");

        double AnoSegundoFilho = scanner.nextDouble();

        System.out.println("Ano de Nascimento Terceiro Filho");

        double AnoTerceiroFilho = scanner.nextDouble();

        if((anoPrimeiroFilho == AnoSegundoFilho) && (AnoSegundoFilho == AnoTerceiroFilho)){
            System.out.println("TRIGÊMEOS");
        }else if((anoPrimeiroFilho == AnoSegundoFilho) || (AnoSegundoFilho == AnoTerceiroFilho) || (anoPrimeiroFilho == AnoTerceiroFilho)){
            System.out.println("GÊMEOS");
        }else{
            System.out.println("IRMÃOS");
        }

        scanner.close();
    }
}