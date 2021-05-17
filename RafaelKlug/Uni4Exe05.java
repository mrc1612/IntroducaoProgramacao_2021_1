import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("A cor é azul??: ");
        boolean cor = tec.nextBoolean();

        //Processo
        if (cor == true) {
            System.out.println("Sim");
        }
        else {
            System.out.println("Não");
        }
    }
}
