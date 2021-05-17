package atividadesfurbifelse;

import java.util.Scanner;

public class atividade12 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triangulo: ");

        int n1 = sc.nextInt();

        System.out.println("Informe o segundo lado do triangulo: ");

        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro lado do triangulo: ");

        int n3 = sc.nextInt();


        if(n1 > 0 && n2 > 0 && n3 > 0){

            if(n1 == n2 && n1 == n3 && n2 == n3){

                System.out.println("O triangulo é equilátero ");

            } else if(n1 == n2 || n1 == n3 || n2 == n3){

                System.out.println("O triangulo é isóscele");


            } else if (n1 != n2 || n1 != n3 || n2 != n3){

                System.out.println("O triangulo é escaleno");


            }

            sc.close();


        }
    }
    

    
    


    
}
