import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe18 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);      
        DecimalFormat df_2 = new DecimalFormat("0.00");  

        int totalPessoas = 0;

        int totalCanal4 = 0;
        int totalCanal5 = 0;
        int totalCanal9 = 0;
        int totalCanal12 = 0;

        System.out.print("Informe o numero da emissora: ");
        int numeroEmissora = tec.nextInt();

        int residentes = 0;

        while (numeroEmissora != 0)
        {
            System.out.print("Informe o numero de pessoas na casa: ");
            residentes = tec.nextInt();

            switch (numeroEmissora)
            {
                case 4:
                    totalCanal4 += residentes;
                    break;

                case 5:
                    totalCanal5 += residentes;
                    break;

                case 9:
                    totalCanal9 += residentes;
                    break;

                case 12:
                    totalCanal12 += residentes;
                    break;
            }

            totalPessoas += residentes;

            System.out.print("Informe o numero da emissora: ");
            numeroEmissora = tec.nextInt();
        }

        if (totalPessoas > 0)
        {
            System.out.println("Porcentagem de audiencia Emissora4: " + (double)((100 * totalCanal4) / totalPessoas));
            System.out.println("Porcentagem de audiencia Emissora5: " + (double)((100 * totalCanal5) / totalPessoas));
            System.out.println("Porcentagem de audiencia Emissora9: " + (double)((100 * totalCanal9) / totalPessoas));
            System.out.println("Porcentagem de audiencia Emissora12: " + (double)((100 * totalCanal12) / totalPessoas));
        }

        tec.close();
    }
}