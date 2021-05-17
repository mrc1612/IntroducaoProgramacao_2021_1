import java.util.Scanner;


public class Uni3Exe12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        String nome;
        double numero_horas;
        double horas_pendentes;
        double total_numero_horas;
        double total_horas_pendentes;
        double salariosujo;
        double salariolimpo;


        System.out.println("Informe seu nome:");
        nome = teclado.nextLine();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        numero_horas = teclado.nextDouble();
        System.out.println("Informe a quantidade de dependentes:");
        horas_pendentes = teclado.nextDouble();

        total_numero_horas = numero_horas*10;
        total_horas_pendentes = horas_pendentes*60;

        salariosujo = total_horas_pendentes+total_numero_horas;

        salariolimpo = salariosujo*0.865;

        System.out.println("Prezado(a) "+nome);
        System.out.println("Seu salário sem descontos: "+salariosujo);
        System.out.println("Seu salário com descontos: "+salariolimpo);
    }
}