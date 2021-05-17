import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a idade do homem 1 ");
        int h1 = input.nextInt();

        System.out.println("Informe a idade do homem 2 ");
        int h2 = input.nextInt();

        System.out.println("Informe a idade da mulher 1 ");
        int m1 = input.nextInt();

        System.out.println("Informe a idade da mulher 2 ");
        int m2 = input.nextInt();

        int HomemVelho;

        int HomemNovo;

        int MulherVelha;

        int MulherNova;



        if(h1 > h2){
            HomemVelho = h1;
            HomemNovo = h2;
        }
        else{
            HomemVelho = h2;
            HomemNovo = h1;
        }

        if(m1 > m2){
            MulherVelha = m1;
            MulherNova = m2;
        }
        else{
            MulherVelha = m2;
            MulherNova = m1;
        }

        System.out.println("Soma = " + (HomemVelho + MulherNova));
        System.out.println("Produto = " + (HomemNovo * MulherVelha));


        input.close();
    }

}