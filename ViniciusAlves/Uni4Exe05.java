import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean azul;

        System.out.println("A cor é azul? Responda: true(SIM) ou false(FALSO)!");
        azul = teclado.nextBoolean();

        if (azul == true){
            System.out.println("Sim!");
        } else {
            System.out.println("Não!");
        }

    }
}