import java.util.Scanner;


public class Uni3Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        String nome;
        double numhrs, numdep, totalnumhrs, totalnumdep, salariosujo, salariolimpo;

        System.out.println("Informe seu nome:");
        nome = teclado.next();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        numhrs = teclado.nextDouble();
        System.out.println("Informe a quantidade de dependentes:");
        numdep = teclado.nextDouble();

        totalnumhrs = numhrs*10;
        totalnumdep = numdep*60;

        salariosujo = totalnumdep+totalnumhrs;

        salariolimpo = salariosujo*0.865;

        System.out.println("Prezado(a) "+nome+"");
        System.out.println("Seu salário sem descontos: "+salariosujo+"");
        System.out.println("Seu salário com descontos: "+salariolimpo+"");

        teclado.close();
    }
}
