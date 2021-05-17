package atividadesfurbifelse;

import java.util.Scanner;

public class atividade9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        if(n1 % n2 == 0){

            System.out.println("Ele são multiplos");

        } else{

            System.out.println("Ele não é multiplo");

        }

        sc.close();

    }
    
}
