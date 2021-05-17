package atividadesfurbifelse;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso da carta em gramas: ");

        double peso = sc.nextDouble();

        double valor = 0.45;

        int cont = 1;

        if(peso <= 50){

            System.out.println(valor);

        } else{

            while(peso - 20 >= 50){

                cont ++;

                peso -= 20;

            }

            System.out.println(valor * cont);

        }

sc.close();


    }
    
}
