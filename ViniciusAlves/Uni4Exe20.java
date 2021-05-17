import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
        System.out.println("Nota Prova 1?");
        double notaProva1 = teclado.nextDouble();

        System.out.println("Nota Prova 2?");
        double notaProva2 = teclado.nextDouble();

        System.out.println("Nota Prova 3?");
        double notaProva3 = teclado.nextDouble();

        System.out.println("Média dos Exercícios?");
        double mediaDosExercicios = teclado.nextDouble();

        double media = (notaProva1 + (notaProva2*2) + (notaProva3*3) + mediaDosExercicios) / 7;


        if (media >= 9){
            System.out.printf("Aprovado!! Conceito: A!! Media: %.2f " , + media);
        } else if ((media >= 7.5) && (media < 9)){
            System.out.printf("Aprovado!! Conceito: B!! Media: %.2f " , + media);
        } else if ((media >= 6) && (media < 7.5)){
            System.out.printf("Aprovado!! Conceito: C!! Media: %.2f " , + media);
        } else if ((media >= 4) && (media < 6)){
            System.out.printf("Reprovado!! Conceito: D!! Media: %.2f " , + media);
        } else if (media < 4){
            System.out.printf("Reprovado!! Conceito: E!! Media: %.2f " , + media);
        }
    }
}