package atividadesfurbifelse;

import java.util.Scanner;

public class atividade19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o X: ");

        double x = sc.nextDouble();

        System.out.println("Informe o Y: ");

        double y = sc.nextDouble();

        if(x == 0 && y == 0){

            System.out.println("0");

        } else if(x >0 && y > 0){

            System.out.println("1");

        } else if(x > 0 && y <0){

            System.out.println("2");

        } else if(x <0 && y <0){

            System.out.println("3");

        } else if(x <0 && y >0){

            System.out.println("4");

        }

        sc.close();

    }
    
}
