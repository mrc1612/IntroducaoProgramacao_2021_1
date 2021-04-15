import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor maior que 0: ");
        int valorA = input.nextInt();
        int valorB = input.nextInt();




        if (valorA * 1.0 % valorB == 0 || valorB * 1.0 % valorA == 0) {

            System.out.println(valorA + " e " + valorB + " são multiplos!");
        } 
        else {
            System.out.println(valorA + " e " + valorB + " não são multiplos!");
        }



        input.close();
    }

}