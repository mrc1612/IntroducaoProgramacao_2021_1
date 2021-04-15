import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor inteiro maior que 0: ");
        int valor = input.nextInt();

        if (valor == 0){

            System.out.println("O valor deve ser inteiro e maior que 0");
        }
        else{
            if(valor % 2 == 0){
                System.out.println("O valor "+ valor +" é par.");
            }
            else{
                System.out.println("O valor "+valor + " é impar.");
            }
        }



        input.close();
    }

}