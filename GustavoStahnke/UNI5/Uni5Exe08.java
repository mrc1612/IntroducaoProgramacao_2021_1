import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidad de numeros que deseja informar: ");
        int quantidadeNumeros = input.nextInt();

        double somaPositivos = 0;
        int quantidadePositivos = 0;
        int menorNegativo = 0;

        int numeroInformado = 0;

        for (int idx = 0; idx < quantidadeNumeros; idx++)
        {
            numeroInformado = input.nextInt();

            if (numeroInformado > 0)
            {
                somaPositivos += numeroInformado;
                quantidadePositivos++;
            }
            else if (numeroInformado < 0 && numeroInformado < menorNegativo)
                menorNegativo = numeroInformado;

        }

        if (menorNegativo == 0)
            System.out.println("Nenhum valor negativo foi informado!");
        else
            System.out.println("Menor valor negativo: " + menorNegativo);

        System.out.println("Media dos numeros positivos: " + somaPositivos / quantidadePositivos);

        input.close();
    }
}