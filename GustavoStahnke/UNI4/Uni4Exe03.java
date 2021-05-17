import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor A: ");
        int valorA = input.nextInt();

        System.out.println("Informe o valor B: ");
        int valorB = input.nextInt();


        if(valorA != valorB){
            if (valorA > valorB){

                System.out.println(valorA +" é maior que " + valorB);
            }
            else{
                System.out.println(valorB +" é maior que " + valorA);
            }
        }
        else{
            System.out.println("Os valores são iguais");
        }



        input.close();
    }

}