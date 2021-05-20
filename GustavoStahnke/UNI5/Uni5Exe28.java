
import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        int totalVotos1 = 0;
        int totalVotos2 = 0;
        int totalVotos3 = 0;
        int totalVotos4 = 0;

        int totalVotos = 0;

        int codigoVoto = 0;

        char continuar = 's';

        while (continuar == 's')
        {
            System.out.print("Informe o codigo da banda: ");
            codigoVoto = tec.nextInt();

            totalVotos++;

            switch (codigoVoto)
            {
                case 1:
                    totalVotos1++;
                    break;

                case 2:
                    totalVotos2++;
                    break;

                case 3:
                    totalVotos3++;
                    break;

                case 4:
                    totalVotos4++;
                    break;
            }

            System.out.print("Mais um voto: s (SIM) / n (NÃO)?" );
            continuar = tec.next().charAt(0);
        }

        System.out.print("\nGrupo vencedor: ");

        if (totalVotos1 > totalVotos2 && totalVotos1 > totalVotos3 && totalVotos1 > totalVotos4)
            System.out.print("Nenhum de Nós");
        else if (totalVotos2 > totalVotos1 && totalVotos2 > totalVotos3  && totalVotos2 > totalVotos4)
            System.out.print("CPM22");
        else if (totalVotos3 > totalVotos1 && totalVotos3 > totalVotos2  && totalVotos3 > totalVotos4)
            System.out.print("CPM22");
        else
            System.out.print("Jota Quest");

        System.out.println("\nTotal votos [1]Nenhum de Nós: " + totalVotos1 + " - " + (100 * totalVotos1 / totalVotos) + "%");
        System.out.println("Total votos [2]CPM22: " + totalVotos2 + " - " + (100 * totalVotos2 / totalVotos) + "%");
        System.out.println("Total votos [3]SKANK:" + totalVotos3 + " - " + (100 * totalVotos3 / totalVotos) + "%");
        System.out.println("Total votos [4]Jota Quest: " + totalVotos4 + " - " + (100 * totalVotos4 / totalVotos) + "%");
        
        tec.close();
    }
}