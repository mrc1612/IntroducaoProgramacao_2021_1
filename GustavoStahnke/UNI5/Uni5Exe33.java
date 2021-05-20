import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        int totalVotos1 = 0;
        int totalVotos2 = 0;
        int totalVotos3 = 0;
        int totalVotos4 = 0;

        int totalEmBranco = 0;
        int totalNulos = 0;

        int totalVotos = 0;

        int codigoVoto = 0;

        do
        {
            System.out.print("Informe o codigo do candidato: ");
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

                case 5:
                    totalNulos++;
                    break;
                
                case 6:
                    totalEmBranco++;
                    break;

                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }
        while (codigoVoto != 0);

        System.out.println("\nTotal votos candidato 1: " + totalVotos1);
        System.out.println("Total votos candidato 2: " + totalVotos2);
        System.out.println("Total votos candidato 3:" + totalVotos3);
        System.out.println("Total votos candidato 4: " + totalVotos4);
        System.out.println("Total votos em branco: " + totalEmBranco + " - " + (100 * totalEmBranco / totalVotos) + "%");
        System.out.println("Total votos nulos: " + totalNulos + " - " + (100 * totalNulos / totalVotos) + "%");
        
        tec.close();
    }
}