import java.util.Scanner;
public class Uni3Exec15 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero,numero2, numero3, centena, dezena, unidade;

        System.out.println("Digite um número de 3 dígitos");
        numero = teclado.nextInt();

        centena = (numero / 100);
        numero2 = (numero - (centena * 100));
        dezena = (numero2 / 10);
        numero3 = (numero2 - (dezena * 10));

        System.out.println( + centena + " centenas " + dezena + " dezenas " + numero3 + " unidades " );

        teclado.close();
    }
}