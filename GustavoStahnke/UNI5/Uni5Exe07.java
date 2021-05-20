import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidad de numeros que deseja informar: ");
        int quantidadeNumeros = input.nextInt();

        int maiorNumero = 0;
        int menorNumero = 0;

        int numeroInformado = 0;

        for (int idx = 0; idx < quantidadeNumeros; idx++)
        {
            numeroInformado = input.nextInt();

            if (idx != 0)
            {
                if (numeroInformado > maiorNumero)
                    maiorNumero = numeroInformado;
                else if (numeroInformado < menorNumero)
                    menorNumero = numeroInformado;
            }
            else
            {
                maiorNumero = numeroInformado;
                menorNumero = numeroInformado;
            }

        }

        System.out.println("Maior valor informado: " + maiorNumero);
        System.out.println("Menor valor informado: " + menorNumero);

        input.close();
    }
}