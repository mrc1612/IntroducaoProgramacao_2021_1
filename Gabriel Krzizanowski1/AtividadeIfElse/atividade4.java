package atividadesfurbifelse;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        
        if (number.contains(".") || number.contains(",")){

            System.out.println("O numero tem ponto flutuante");
            
        } else{

            System.out.println("O numero nao tem ponto flutuante ");

        }

     

        sc.close();

    }
    
}
