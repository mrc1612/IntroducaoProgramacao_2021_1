package AtividadesFurb;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de 3 digitos: ");

        int numero = sc.nextInt();


        int centena = (numero / 100) * 100 ;

        int dezena =  (numero / 10) * 10 - centena; 

        int unidade = numero - centena - dezena;

        System.out.println(centena);

        System.out.println(dezena);

        System.out.println(unidade);

        sc.close();

    }
    
}
