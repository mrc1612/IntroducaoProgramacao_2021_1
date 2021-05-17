package atividadesfurbifelse;

import java.util.Scanner;

public class atividade11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Informe a idade do primeiro irmão");
       
        int idade1 = sc.nextInt();

        System.out.println("Informe a idade do segundo irmão");

        int idade2 = sc.nextInt();

        System.out.println("Informe a idade do terceiro irmão");

        int idade3 = sc.nextInt();

        if(idade1 == idade3 && idade1 == idade2 && idade2 == idade3){

            System.out.println("Eles são trigemeos");

        } else if(idade1 == idade2 || idade1 == idade3 || idade2 == idade3){

            System.out.println("Dois são gemeos");

        } else{

                System.out.println("São apenas irmãos");

        }

sc.close();

    }
    
}
