import java.util.Scanner;

import javax.management.Descriptor;

public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double mult, desconto, resultado;
        System.out.println("Qual o valor do par de sapato?");
        mult = teclado.nextInt();

        resultado = mult*0.80;
        desconto = mult-resultado;

        System.out.println("O valor do desconto é de R$"+desconto+"");
        System.out.println("O preço do par de sapatos com desconto é R$ "+resultado+"");


        teclado.close();
        

    }
}
