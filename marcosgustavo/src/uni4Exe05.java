import java.util.Scanner;

public class uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("a cor é azul?");
        Boolean resposta = teclado.nextBoolean();;

        if (resposta) {
            System.out.println("Sim, é azul.");
        } else {
            System.out.println("Não, não é azul.");
        }
        teclado.close();
    }
}