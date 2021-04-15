import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Ex20 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    float notaProva1, notaProva2, notaProva3, notaExercicios;
        System.out.print("Informe a nota da Prova 1: ");
        notaProva1 = teclado.nextFloat();
        System.out.print("Informe a nota da Prova 2: ");
        notaProva2 = teclado.nextFloat();
        System.out.print("Informe a nota da Prova 3: ");
        notaProva3 = teclado.nextFloat();
        System.out.print("Informe a média dos exercicios: ");
        notaExercicios = teclado.nextFloat();
        String conceito = " e o conceito do aluno é ";
        String mediaAluno = "A média do aluno é de ";
        String aprovado = "Situacao do aluno: APROVADO";
        float media = (float) ((notaProva1 + notaProva2 * 2 + notaProva3 * 3 +notaExercicios) / 7);
        DecimalFormat df = new DecimalFormat("#.#");
        if(media >= 9){
            System.out.println(mediaAluno+ df.format(media) +conceito + "A.");
            System.out.println(aprovado);
        }else{
            if(media >= 7.5 && media < 9){
            System.out.println(mediaAluno+ df.format(media) +conceito + "B.");
            System.out.println(aprovado);
        }else{
         if(media >= 6 && media < 7.5){
            System.out.println(mediaAluno+ df.format(media) +conceito + "C.");
            System.out.println(aprovado);
        }else{
         if(media >= 4.0 && media < 6){
            System.out.println(mediaAluno+ df.format(media) +conceito + "D.");
            System.out.println("Situação do aluno: reprovado!");
        }else{
        if (media < 4){
            System.out.println(mediaAluno+ df.format(media) +conceito + "E.");
            System.out.println("Situação do aluno: reprovado!");
}}}}}}}