import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horasTrabalhadasMes = scanner.nextDouble();
        double valorPorHora = scanner.nextDouble();

        double horasSemanais = horasTrabalhadasMes / 4;

        double salario = 0;

        if( horasSemanais > 40){
            double horaExtra = (horasTrabalhadasMes - 160) * ((valorPorHora * 0.5) + valorPorHora);
            salario = valorPorHora *horasTrabalhadasMes + horaExtra;
            System.out.println("salario total: " + salario);
            scanner.close();
        }
        else{
            salario = valorPorHora * horasTrabalhadasMes;
            System.out.println("salario total: " + salario);
            scanner.close();
        }
    }
}