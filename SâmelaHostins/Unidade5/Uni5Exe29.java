/*Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que
 leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar
  para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele 
  fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá 
  duas cédulas de 20, uma de 5 e outras de 2.*/
import java.util.Scanner;
public class Uni5Exe29 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        char dados = 'S';
        System.out.println("Informe um valor inteiro:");
        int valor = ler.nextInt();

        while (dados == 'S' || dados == 's'){ 
System.out.println(valor / 20 + " nota(s) de 20");
valor = valor % 20;
System.out.println(valor / 10 + " nota(s) de 10");
valor = valor % 10;
System.out.println(valor / 5 + " nota(s) de 5");
valor = valor % 5;
System.out.println(valor / 2 + " nota(s) de 2");
valor = valor % 2;
System.out.println(valor / 1 + " nota(s) de 1");
valor = valor % 1;

        System.out.println("Deseja colocar outro valor? s (SIM) / n (NÃO)?");
        dados = ler.next().charAt(0);
    }
}}
