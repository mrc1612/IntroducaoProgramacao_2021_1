import java.util.Scanner;

public class Uni5Exe11 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


        int quantidadeQuebrada = 0;

        for (int hora = 0; hora < 16; hora++)
            quantidadeQuebrada += Math.pow(3, hora);


        System.out.println("Biscoitos quebrados: " + quantidadeQuebrada);
        

        input.close();
    }
}