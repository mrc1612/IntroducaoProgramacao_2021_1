import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


        System.out.println("1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei");

        System.out.println("Informe o valor 1: ");
        int c1 = input.nextInt();
        boolean c1Boa = false;

        System.out.println("Informe o valor 2: ");
        int c2 = input.nextInt();
        boolean c2Boa = false;

        System.out.println("Informe o valor 3: ");
        int c3 = input.nextInt();
        boolean c3Boa = false;

        if(c1 == 1 || c1 == 2 || c1== 3){
            c1Boa = true;
        }
        if(c2 == 1 || c2 == 2 || c2== 3){
            c2Boa = true;
        }
        if(c3 == 1 || c3 == 2 || c3== 3){
            c3Boa = true;
        }

        if(c1Boa && c2Boa && c3Boa){
            System.out.println("NOVE");
        }
        else{

            if((c1Boa && c2Boa) || (c2Boa && c3Boa) || (c1Boa && c3Boa)){
                System.out.println("SEIS");
            }
            else{
                
                if(c1Boa || c2Boa || c3Boa){
                    System.out.println("TRUCO");
                }
            }
        }

        input.close();
    }
}
