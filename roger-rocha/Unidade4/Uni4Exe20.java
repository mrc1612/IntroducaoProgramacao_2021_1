import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        //ENTRADA DE DADOS
        System.out.println("Informe a nota da Prova 1: ");
        float notaProva1 = teclado.nextFloat();
        System.out.println();
        System.out.println("Informe a nota da Prova 2: ");
        float notaProva2 = teclado.nextFloat();
        System.out.println();
        System.out.println("Informe a nota da Prova 3: ");
        float notaProva3 = teclado.nextFloat();
        System.out.println();
        System.out.println("Informe a media dos exercicios: ");
        float notaExercicios = teclado.nextFloat();
        System.out.println();
        String conceito = " e o conceito do aluno eh: ";
        String mediaAluno = "A media do aluno foi de: ";
        String aprovado = "Situacao do aluno: APROVADO";
        float media = (float) ((notaProva1 + notaProva2 * 2 + notaProva3 * 3 +notaExercicios) / 7);
        DecimalFormat df = new DecimalFormat("#.#");
        
        
        if(media >= 9)
        {
            System.out.println(mediaAluno+ df.format(media) +conceito + " A");
            System.out.println(aprovado);
        }
        else if(media >= 7.5 && media < 9)
        {
            System.out.println(mediaAluno+ df.format(media) +conceito + " B");
            System.out.println(aprovado);
        }
        else if(media >= 6 && media < 7.5)
        {
            System.out.println(mediaAluno+ df.format(media) +conceito + " C");
            System.out.println(aprovado);
        }
        else if(media >= 4.0 && media < 6)
        {
            System.out.println(mediaAluno+ df.format(media) +conceito + " D");
            System.out.println("Situacao do aluno: REPROVADO");
        }
        else if (media < 4)
        {
            System.out.println(mediaAluno+ df.format(media) +conceito + " E");
            System.out.println("Situacao do aluno: REPROVADO");
        }
        
    
    }    
}
