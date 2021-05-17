

/*Dada uma turma de alunos, contendo seu nome e nota de duas provas 
descreva um algoritmo para informar a média de cada aluno. Considere 
que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.*/
import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome = "";
        double nota1, nota2, media;

           while(!nome.equals("fim"))
            if (nome != "fim"){
            System.out.println("Digite o nome do aluno:");
            nome = ler.next();
            System.out.println("Digite a nota da prova 1:");
            nota1 = ler.nextInt();
            System.out.println("Digite a nota da prova 2:");
            nota2 = ler.nextInt();
        media = (nota1 + nota2) /2;
        System.out.println("A media do " +nome + " é de: " + media);
        System.out.println("\n");
        System.out.println("Se você quiser saber media de outro aluno digite seu nome, se não escreva a palavra fim");
            }
        }

    }


