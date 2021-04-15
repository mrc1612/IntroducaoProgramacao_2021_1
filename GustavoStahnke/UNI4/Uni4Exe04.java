import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor maior que 0: ");
        float valor = input.nextFloat();



        if (valor == 0){

            System.out.println("O valor deve maior que 0");
        }
        else{
            if(valor % 1 != 0){
                System.out.println("Foram digitadas casas decimais.");
            }
            else{
                System.out.println("Não foram digitadas casas decimais.");
            }
        }



        input.close();
    }

}