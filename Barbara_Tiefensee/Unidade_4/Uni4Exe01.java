import java.util.*;

public class Uni4Exe01 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double salarioNormal;
        double salarioPorHora;
        double salarioExtra;
        double salarioTotal;
        double valorHoraExtra;
        
        double qtdHoraExtra;
        double horasTrabalhadas;

        System.out.print("Informe o numero de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextDouble();

        System.out.println("Informe o valor do salario por hora: ");
        salarioPorHora = teclado.nextDouble();

        salarioExtra = 0;
        
        if(horasTrabalhadas <= 160)
        {
            //calculo do salario
            salarioNormal = horasTrabalhadas * salarioPorHora;
        }
        else
        {
            //calculo do salario
            salarioNormal = 160 * salarioPorHora;

            //calculo horas extra
            qtdHoraExtra = horasTrabalhadas - 160;

            //salario + 50%
            valorHoraExtra = salarioPorHora + (salarioPorHora * 50) / 100;

            //calculo do valor total em horas extras
            salarioExtra = valorHoraExtra * qtdHoraExtra;
        }

        salarioTotal = salarioNormal + salarioExtra;

        System.out.println("O salario total do funcionario acrescido com horas extras foi de:" + salarioTotal);;
    }
}
