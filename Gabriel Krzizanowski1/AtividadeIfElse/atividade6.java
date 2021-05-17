package atividadesfurbifelse;

import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu Sexo: ");


        String sexo = sc.next();


     if(sexo.equalsIgnoreCase("F")){

        System.out.println("Sexo Feminino");

     } else if(sexo.equalsIgnoreCase("M")){

        System.out.println("Sexo Masculino");

     } else if(sexo.equalsIgnoreCase("I")){

        System.out.println("Sexo Indefinido");

     } else{

        System.out.println("Sexo não identificado");

     }
    

        sc.close();
        
    }
    
}
