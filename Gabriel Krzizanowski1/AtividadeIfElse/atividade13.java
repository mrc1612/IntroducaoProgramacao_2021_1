
import java.util.Scanner;

public class atividade13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int as = 1;
        int dois = 2;
        int tres = 3;
        int sete = 7;
        int valete = 11;
        int dama = 12;
        int rei = 13;

        System.out.println("Informe o primeiro valor");

        int n1 = sc.nextInt();

        System.out.println("Informe o segundo valor");

        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro valor");

        int n3 = sc.nextInt();

        if((n1 == as && n2 == dois && n3 == tres) || (n1 == as && n2 == tres && n3 == dois) || (n1 == dois && n2 == as && n3 == tres) || (n1 == tres && n2 == dois && n3 == as) || (n1 == tres && n2 == as && n3 == dois) || (n1 == dois && n2 == tres && n3 == as)){

            System.out.println("Truco");
            System.out.println("Nove");

        } 
        
        if((n1 == as && n2 == dois && n3 != tres) || (n1 == dois && n2 == as && n3 != tres) || (n1 == as && n2 == tres && n3 != dois) || (n1 == tres && n2 == as && n3 != dois) || (n1 == dois && n2 == tres && n3 != as) || (n1 == tres && n2 == dois && n3 != as)) {

            System.out.println("Truco");
            System.out.println("Seis");


        }  else {


            System.out.println("cu");
        }
        
     

       


    }
    
}

 
