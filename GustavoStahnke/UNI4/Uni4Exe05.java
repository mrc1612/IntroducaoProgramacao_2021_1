import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("A cor é azul? ");
        boolean resposta = input.nextBoolean();



        if (resposta) {

            System.out.println("Sim");
        }
        else{
            System.out.println("Não");

        }



        input.close();
    }

}