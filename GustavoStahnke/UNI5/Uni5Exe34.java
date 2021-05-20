import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe34 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int codigo = 0;

        String nomeHospede;
        int numeroDiarias = 0;

        int numeroEncerradas = 0;
        double totalPagar = 0;

        System.out.println("[Opcoes] ");
        System.out.println("(1) encerrar a conta de um hóspede");
        System.out.println("(2) verificar número de contas encerradas");
        System.out.println("(3) sair");

        do
        {
            System.out.print("Informe o codigo da operação: ");
            codigo = tec.nextInt();

            if (codigo == 1)
            {
                System.out.print("Informe o nome do hospede: ");
                nomeHospede = tec.next();

                System.out.print("Informe a quantidade de diarias: ");
                numeroDiarias = tec.nextInt();

                System.out.println("Nome: " + nomeHospede);

                if (numeroDiarias < 15)
                    totalPagar = numeroDiarias * 7.5;
                else if (numeroDiarias == 15)
                    totalPagar = numeroDiarias * 6.5;
                else
                    totalPagar = numeroDiarias * 5;

                    System.out.println("Total a ser pago: R$" + df_2.format(totalPagar));

                numeroEncerradas++;
            }

            else if (codigo == 2)
                System.out.println("Total de contas encerradas: " + numeroEncerradas);
        }
        while (codigo != 3);
        
        tec.close();
    }
}