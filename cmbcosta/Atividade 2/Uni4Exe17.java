import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Qual seu salário?");
        double salario = scanner.nextDouble();

        System.out.println("Número de dependente?");
        double dependentes = scanner.nextDouble();
        double percentualDesconto = dependentes * 0.02;
        double rendaAnual = salario * 12;
        double rendaliquida = rendaAnual - (percentualDesconto * rendaAnual);
        

        if((salario) >= 0 && (salario) <= 2000){
            System.out.println("Não paga Imposto!");
        }else if((salario) > 2000 && (salario) <= 5000){ 

        double imposto = rendaliquida * 0.05;
        System.out.println("Valor Imposto" + imposto);

        }else if((salario) > 5000 && (salario) <= 10000){
            double imposto = rendaliquida * 0.10;
            System.out.println("Valor Imposto" + imposto);

        }else if(salario > 10000){
            double imposto = rendaliquida * 0.15;
            System.out.println("Valor Imposto" + imposto);

        }





        scanner.close();
    }
}