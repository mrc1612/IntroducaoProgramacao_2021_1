import java.util.Scanner;

public class Uni3Exe06 {

    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double prato_Montado;
        double preco;
        prato_Montado = teclado.nextFloat();

        prato_Montado = (prato_Montado - 0.750);

        preco = prato_Montado * 25;

        System.out.println("O peso do seu prato é de: " + prato_Montado);
        System.out.println("O preço a pagar é: R$" + preco);

        teclado.close();
    }    
}
