package atividadesfurbifelse;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe as horas trabalhadas no mês: (Se valor passar de 160 é considerado hora extra) ");

            double horas = sc.nextDouble();

            System.out.println("Informe o valor por hora: ");

            double valorhora = sc.nextDouble();


            if(horas <= 160){

                double calculo = horas * valorhora;

                System.out.println(calculo);


            } else if(horas > 160){

                double teste = horas - 160;

                double valorFinal = valorhora + (valorhora * 0.5);

                double calculoFinal = (teste * valorFinal); 

                double calculoNormal = (horas * valorhora) + calculoFinal;

                System.out.println(calculoNormal);

            }

            sc.close();

         
    }
    
}
