import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    float notaProva1, notaProva2, notaProva3, notaExercicios;
        System.out.println("Informe a nota da Prova 1: ");
        notaProva1 = ler.nextFloat();
        System.out.println();
        System.out.println("Informe a nota da Prova 2: ");
        notaProva2 = ler.nextFloat();
        System.out.println();
        System.out.println("Informe a nota da Prova 3: ");
        notaProva3 = ler.nextFloat();
        System.out.println();
        System.out.println("Informe a media dos exercicios: ");
        notaExercicios = ler.nextFloat();
        System.out.println();
        String conceito = " e o conceito do aluno é: ";
        String mediaAluno = "A media do aluno foi de: ";
        String aprovado = "Situacao do aluno: APROVADO";
        float media = (float) ((notaProva1 + notaProva2 * 2 + notaProva3 * 3 +notaExercicios) / 7);
        DecimalFormat df = new DecimalFormat("#.#");
        
        
        if(media >= 9){
            System.out.println(mediaAluno+ df.format(media) +conceito + " A");
            System.out.println(aprovado);
        }else{
            if(media >= 7.5 && media < 9){
            System.out.println(mediaAluno+ df.format(media) +conceito + " B");
            System.out.println(aprovado);
        }else{
         if(media >= 6 && media < 7.5){
            System.out.println(mediaAluno+ df.format(media) +conceito + " C");
            System.out.println(aprovado);
        }else{
         if(media >= 4.0 && media < 6){
            System.out.println(mediaAluno+ df.format(media) +conceito + " D");
            System.out.println("Situacao do aluno: REPROVADO");
        }else{
        if (media < 4){
            System.out.println(mediaAluno+ df.format(media) +conceito + " E");
            System.out.println("Situacao do aluno: REPROVADO");
        }}}}}}}