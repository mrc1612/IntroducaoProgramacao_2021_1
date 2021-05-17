package atividadesfurbifelse;

import java.util.Scanner;

public class atividade15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário atual: ");

        double salario = sc.nextDouble();

        System.out.println("Informe a quantidade de meses que você foi admitido: ");

        int meses = sc.nextInt();

        if(meses >1 && meses <= 12){

            double percentual = 5.0 / 100;

            double valorFinal = salario + (percentual * salario);

            System.out.println("O reajuste salarial para este funcionário será: "+ valorFinal);

        } else if(meses >12 && meses <= 48){

            
            double percentual = 7.0 / 100;

            double valorFinal = salario + (percentual * salario);

            System.out.println("O reajuste salarial para este funcionário é de: " + valorFinal);

        } else{

            System.out.println("Reajuste não calculado");

        }

            sc.close();

    }
    
}
