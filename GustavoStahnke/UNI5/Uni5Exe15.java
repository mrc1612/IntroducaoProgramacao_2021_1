
import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        String nomeAluno;

        double primeiraNota = 0;
        double segundaNota = 0;

        System.out.print("Informe o nome do aluno: ");
        nomeAluno = input.next();

        while (!nomeAluno.equals("fim"))
        {
            System.out.print("Informe a primeira nota: ");
            primeiraNota = input.nextDouble();

            System.out.print("Informe a segunda nota: ");
            segundaNota = input.nextDouble();

            System.out.println("A media do aluno é: " + (primeiraNota + segundaNota) / 2);

            System.out.print("Informe o nome do aluno: ");
            nomeAluno = input.next();
        }
        
        input.close();
    }
}