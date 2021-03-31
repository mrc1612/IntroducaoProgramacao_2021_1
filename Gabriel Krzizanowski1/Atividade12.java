package AtividadesFurb;

import java.util.Scanner;


public class Atividade12 {

    public static void main(String[] args) {

      int qtd = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");

        String nome = sc.next();

        System.out.println("Informe as horas trabalhadas: ");

        double horas = sc.nextDouble();

        System.out.println("Você tem filhos ou dependetes? ");

        char dependentes = sc.next().charAt(0);

        if (dependentes == 'S' || dependentes == 's') {

            System.out.println("Informe a quantidade de dependetes: ");

            qtd = sc.nextInt();



        } 


        
        double valorPorHora = horas * 10;

        double calculoPorDependetes = qtd * 60;

        double descontos = (valorPorHora - ((13.5/100) * valorPorHora)) + calculoPorDependetes ;



        System.out.println(nome);
        System.out.println(valorPorHora);
        System.out.println(descontos);



sc.close();

    }
    
}
