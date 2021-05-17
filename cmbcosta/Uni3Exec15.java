import java.util.Scanner;
public class Uni3Exec15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero,numero2, unidade, centena, dezena;

        System.out.println("Digite um número de 3 dígitos");
        numero = scanner.nextInt();

        centena = (numero / 100);
        numero2 = (numero - (centena * 100));
        dezena = (numero2 / 10);
        unidade = (numero2 - (dezena * 10));
        System.out.println(numero2);


        System.out.println( + centena + " centenas " + dezena + " dezenas " + unidade + " unidades " );

        scanner.close();
    }
}