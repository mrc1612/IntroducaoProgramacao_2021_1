import java.util.Scanner;

public class Uni5Exe09 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String idade18 = "Aluno c/ 18 anos: \n";
        int maior20 = 0;
    
        System.out.println("Informe qtd. alunos: ");
        int alunoNumero = sc.nextInt();
        for (int i = 1; i <= alunoNumero; i++) {
          System.out.println("Informe o nome: ");
          nome = sc.next();
          System.out.println("Informe a idade: ");
          idade = sc.nextInt();
          if (idade == 18) {
            idade18 = idade18 + nome + "\n";
          }
          if (idade > 20) {
            maior20++;
          }
        }
        System.out.println(idade18);
        System.out.println("Quantos aluno maiores que 20 anos: " + maior20);
    
        sc.close();
    }    
}
