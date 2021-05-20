import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe27 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int produzidasManha = 0;
        int produzidasTarde = 0;

        double salario = 0;

        int  dia = 0;

        boolean continuar = true;
        int codigoContinuar = 0;

        int maiorProducao = 0;
        int diaMaiorProducao = 0;

        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;
        int totalProducaoDia = 0;

        while (continuar)
        {
            System.out.print("Informe o dia de Abril valido (de 1 a 30): ");
            dia = input.nextInt();

            while (dia < 1 || dia > 30)
            {
                System.out.println("Dia inválido!");
                dia = input.nextInt();
            }
        
            System.out.print("Informe o total de peças produzidas pelo funcionário no turno da manhã: ");
            produzidasManha = input.nextInt();

            System.out.print("Informe o total de peças produzidas pelo funcionário no turno da tarde: ");
            produzidasTarde = input.nextInt();

            totalProducaoManha += produzidasManha;
            totalProducaoTarde += produzidasTarde;

            totalProducaoDia = produzidasManha + produzidasTarde;

            if (totalProducaoDia > maiorProducao)
            {
                maiorProducao = totalProducaoDia;
                diaMaiorProducao = dia;
            }

            if (dia <= 15)
            {
                if (totalProducaoDia > 100 && produzidasManha >= 30 && produzidasTarde >= 30)
                    salario = (totalProducaoDia) * .8;
                else
                    salario = (totalProducaoDia) * .5;
            }
            else
                salario = produzidasManha * .4 + produzidasTarde * .3;

            System.out.println("R$ " + df_2.format(salario) + " (valor recebido)");

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            codigoContinuar = input.nextInt();

            if (codigoContinuar == 2)
                continuar = false;
        }
        
        System.out.println("Dia em que ocorreu a maior produção:" + diaMaiorProducao);

        System.out.print("Período no qual funcionário mais produz: ");

        if (totalProducaoTarde > totalProducaoManha)
            System.out.print(" tarde - " + totalProducaoTarde);
        else
            System.out.print(" manha - " + totalProducaoManha);
        
        input.close();
    }
}