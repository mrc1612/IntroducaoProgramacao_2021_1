import java.util.Scanner;

public class Uni3Exe07 {

    /*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.*/

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int qtd1, qtd2, qtd3;
        /* qtd = quantidade */
        double litros;
        System.out.println("Quantas latas de 350ml você comprou? ");
        qtd1 = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml você comprou? ");
        qtd2 = teclado.nextInt();
        System.out.println("Quantas garrafas de 2 litros você comprou? ");
        qtd3 = teclado.nextInt();

        litros = (qtd1 * 0.350) + (qtd2 * 0.6) + (qtd3 * 2);

        System.out.println("Você comprou " + litros + " litros de refrigerante");

        teclado.close();
    } 
}
