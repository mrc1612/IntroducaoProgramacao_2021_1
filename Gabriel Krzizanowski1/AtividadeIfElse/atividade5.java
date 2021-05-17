package atividadesfurbifelse;

import java.util.Scanner;   

public class atividade5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        System.out.println("A cor é azul? ");

         boolean sim = sc.nextBoolean();

        if(sim == true){

            System.out.println("Sim");

        } else {

            System.out.println("Não");

        }

        sc.close();

    }
    
}
