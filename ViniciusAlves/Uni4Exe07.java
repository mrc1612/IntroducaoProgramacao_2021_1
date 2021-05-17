import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double carta, valorselo;

        System.out.println("Informe o peso da carta em gramas");
        carta = teclado.nextDouble();

        if (carta > 50 ) {
            valorselo = 0.45 + (((carta - 50) / 20)*0.45);
        } else {
            valorselo = 0.45;
        }
        System.out.println("O custo do selo é R$" + valorselo);
    }
}