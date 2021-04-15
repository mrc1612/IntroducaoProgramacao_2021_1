import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double horasTrabalhadas, valorPorHora, salario;

        System.out.println("Informe o número de horas trabalhadas neste mês");

        horasTrabalhadas = ler.nextDouble();

        System.out.println("Informe o valor que você recebe por hora");

        valorPorHora = ler.nextDouble();

        if (horasTrabalhadas > 160 ) {

            salario = valorPorHora *1.5* horasTrabalhadas;

        }else{

            salario =  valorPorHora * horasTrabalhadas;

        }

        System.out.println("Seu salário é " + salario);
        
        }
    }
