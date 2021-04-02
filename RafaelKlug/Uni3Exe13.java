import java.util.Scanner;

public class Uni3Exe13 {
    /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos. */

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double azulejo, comp, alt, parede, preco;
        /*azulejo = qtd de azulejo, comp = comprimento, alt = altura, parede = tamanho da parede */
        System.out.println("Digite o comprimento da parede (em metros): ");
        comp = teclado.nextDouble();
        System.out.println("Digite a altura da parede (em metros): ");
        alt = teclado.nextDouble();

        parede = (alt * comp);

        azulejo = (parede * 9);

        preco = (azulejo * 12.5);

        System.out.println("A quantidade de azulejos é: " + azulejo);
        System.out.println(azulejo + " azulejos custam R$" + preco);
        
        teclado.close();
    }
    
}
