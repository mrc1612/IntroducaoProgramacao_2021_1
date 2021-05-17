import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double pesoDaCarta, custoDoSelo;

        System.out.println("Informe o peso da carta em gramas");

        pesoDaCarta = ler.nextDouble();


        if (pesoDaCarta > 50 ) {

            custoDoSelo = 0.45 + (((pesoDaCarta - 50) / 20)*0.45);

        }else{

            custoDoSelo = 0.45;

        }
        System.out.println("O custo do selo é " + custoDoSelo);

    }
}
