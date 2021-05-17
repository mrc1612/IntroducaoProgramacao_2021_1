package atividadesfurbifelse;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();


        if(n1 == n2){

            System.out.println("Os dois são iguais");

        } else{

        if(n1 > n2){

            System.out.println("O primeiro numero é maior");


        } else{

            System.out.println("O segundo numero é maior");

        }

         }

        sc.close();

        

    }
    
}
