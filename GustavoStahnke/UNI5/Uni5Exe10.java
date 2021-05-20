import java.util.Scanner;

public class Uni5Exe10 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        int quantidadeEncontrada = 0;
        int potencia = 0;

        System.out.println("[Assumindo que sejam apeans com 4 digitos]");
        for (int numeroTeste = 1000; numeroTeste < 9999; numeroTeste++)
        {
            potencia = (numeroTeste / 100) + (numeroTeste % 100);

            if (potencia * potencia == numeroTeste)
            {
                quantidadeEncontrada++;

                System.out.println("[" + quantidadeEncontrada + "] " + numeroTeste);

                if (quantidadeEncontrada == 10)
                    break;
            }
        }


        quantidadeEncontrada = 0;
        potencia = 0;
        int metade = 0;

        System.out.println("\n[Assumindo que seja a potencia de (metade + metade) de um real qualquer]");
        for (int numeroTeste = 1000; quantidadeEncontrada < 10; numeroTeste++)
        {
            metade = Integer.toString(numeroTeste).length() / 2;

            potencia = (numeroTeste / (int)Math.pow(10, metade)) + (numeroTeste % (int)Math.pow(10, metade));

            if (potencia * potencia == numeroTeste)
            {
                quantidadeEncontrada++;

                System.out.println("[" + quantidadeEncontrada + "] " + numeroTeste);
            }
        }
       
        input.close();
    }
}