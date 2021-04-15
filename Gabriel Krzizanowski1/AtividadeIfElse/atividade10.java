package atividadesfurbifelse;

import java.util.Scanner;

public class atividade10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int marquinhos;

        int luluzinha;

        int zezinho;

        System.out.println("Informe a idade de Marquinhos");

        marquinhos = sc.nextInt();

        System.out.println("Informe a idade de zezinho");

        zezinho = sc.nextInt();

        System.out.println("Informe a idade de luluzinha");

        luluzinha = sc.nextInt();

        if(marquinhos < zezinho && marquinhos < luluzinha){

            System.out.println("Marquinhos é o menor");


        } else if(zezinho < marquinhos && zezinho < luluzinha){

            System.out.println("Zezinho é o menor");


        } else if(luluzinha < marquinhos && luluzinha < zezinho ){

            System.out.println("Luluzinha é a menor");


        }

sc.close();

    }
    
}
