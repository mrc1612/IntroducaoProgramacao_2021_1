import java.util.Scanner;

public class Uni5Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        String idade18 = "";
        int maior20 = 0;
        System.out.print("Informe a quantidade de alunos: ");
        int alunoNumero = teclado.nextInt();
        for (int i = 1; i <= alunoNumero; i++) {
          System.out.print("Informe o nome: ");
          nome = teclado.next();
          System.out.print("Informe a idade: ");
          idade = teclado.nextInt();
          if (idade == 18) {
            idade18 = idade18 + nome + "\n";
          }
          if (idade > 20) {
            maior20++;
          }
        }
        System.out.print("Aluno(s) com 18 anos: " + idade18);
        System.out.println("Quantos alunos têm mais de 20 anos? " + maior20);
    }    
}