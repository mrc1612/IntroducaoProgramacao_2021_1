import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);     


        int numeroIncricao = 0;

        double altura = 0;

        double menorAltura = 0;
        int numeroMenorAltura = 0;

        double maiorAltura = 0;
        int numeroMaiorAltura = 0;

        int totalAtletas = 0;
        double totalAltura = 0;

        System.out.print("Informe o numero de inscricao: ");
        numeroIncricao = tec.nextInt();

        while (numeroIncricao > 0)
        {
            System.out.print("Informe a altura: ");
            altura = tec.nextDouble();

            if (numeroMaiorAltura == 0)
            {
                numeroMaiorAltura = numeroIncricao;
                maiorAltura = altura;

                numeroMenorAltura = numeroIncricao;
                menorAltura = altura;
            }
            else
            {
                if (altura > maiorAltura)
                {
                    maiorAltura = altura;
                    numeroMaiorAltura = numeroIncricao;
                }
                else if (altura < menorAltura)
                {
                    menorAltura = altura;
                    numeroMenorAltura = numeroIncricao;
                }
            }

            totalAtletas++;
            totalAltura += altura;

            System.out.print("Informe o numero de inscricao: ");
            numeroIncricao = tec.nextInt();
        }

        if (numeroMaiorAltura > 0)
        {
            System.out.println("O número de inscrição e a altura do atleta mais alto: " + numeroMaiorAltura);
            System.out.println("O número de inscrição e a altura do atleta mais baixo: " + numeroMenorAltura);

            System.out.println("Altura média do grupo de atletas " + (totalAltura / totalAtletas));
        }

        tec.close();
    }
}