package atividadesfurbifelse;

import java.util.Scanner;

public class atividade20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");

        double n1 = sc.nextDouble();

        System.out.println("Informe a segunda nota: ");

        double n2 = sc.nextDouble();

        System.out.println("Informe a terceira nota: ");

        double n3 = sc.nextDouble();

        System.out.println("Informe a media dos exercicios: ");

        double mediaExercicios = sc.nextDouble();

        double media = ((n1)+(n2 *2)+(n3*3)+(mediaExercicios))/7;
       
        if(media >= 9){

            System.out.println("");

            System.out.println(media);
           
            System.out.println("Nota A !! Aprovado");

        } else if(media >= 7.5 && media <9){

            System.out.println("");

            System.out.println(media);

            System.out.println("Nota B !! Aprovado");

        } else if(media >=6.0 && media <7.5){

            System.out.println("");

            System.out.println(media);

            System.out.println("Nota C !! aprovado");

        } else if(media >= 4 && media <6){

            System.out.println("");

            System.out.println(media);

            System.out.println("Nota D, reprovado");

        } else if(media <4){

            System.out.println("");

            System.out.println(media);

            System.out.println("Nota E, reprovado");

        }

        sc.close();
        

    }
    
}
