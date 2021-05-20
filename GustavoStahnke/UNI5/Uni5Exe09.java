import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidad de alunos na turma: ");
        int quantidadeAlunos = input.nextInt();

        String nomeAluno;
        int idadeAluno = 0;

        String alunosCom18 = "";
        int quantidadeAcimaDe20 = 0;

        for (int idx = 0; idx < quantidadeAlunos; idx++)
        {
            System.out.print("[" + (idx + 1) + "] Informe o nome do aluno: ");
            nomeAluno = input.next();

            System.out.print("[" + (idx + 1) + "] Informe a idade do aluno: ");
            idadeAluno = input.nextInt();

            if (idadeAluno == 18)
                alunosCom18 += " " + nomeAluno;
            
            if (idadeAluno > 20)
                quantidadeAcimaDe20++;
            
            System.out.print("\n");

        }
        input.close();
    }
}