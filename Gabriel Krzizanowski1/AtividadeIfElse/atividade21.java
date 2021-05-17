package atividadesfurbifelse;

import java.util.Scanner;

public class atividade21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura em metros: ");

        double altura = sc.nextDouble();

        System.out.println("Informe o seu peso em kilos: ");

        double peso = sc.nextDouble();

        double imc = peso/(altura * altura);

         if(imc <18.5){

            System.out.printf("IMC igual a: %.2f magreza",imc);

         } else if(imc >= 18.5 && imc <= 24.9){

            System.out.printf("IMC igual a: %.2f Saudável",imc);

         } else if(imc >=25.0 && imc <= 29.9){

            System.out.printf("IMC igual a: %.2f Sobrepeso",imc);

         } else if(imc >= 30.0 && imc <= 34.9){

            System.out.printf("IMC igual a: %.2f Obesidade Grau I",imc);

         } else if(imc >= 35.0 && imc <= 39.9){

            System.out.printf("IMC igual a: %.2f Obesidade Grau II (severa)",imc);

         } else if(imc >= 40){

            System.out.printf("IMC igual a: %.2f Obesidade Grau III (mórbida)",imc);

         }



        sc.close();

    }
    
}
