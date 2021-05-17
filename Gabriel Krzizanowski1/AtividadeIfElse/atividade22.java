package atividadesfurbifelse;

import java.util.Scanner;

public class atividade22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe um dos numeros abaixo para saber o seu titulo apos a faculdade (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação)");

        int n = sc.nextInt();

        if(n <1 && n >3){

            System.out.println("Dado inexistente");

        }

        switch (n){

            case 1:

            System.out.println("Bacharel em Ciência da Computação");

            break;

            case 2:

            System.out.println("Licenciado em Computação");

            break;

            case 3:

            System.out.println("Bacharel em Sistemas de Informação");

            break;

            default:

            break;

        }

        sc.close();

    }
    
}
