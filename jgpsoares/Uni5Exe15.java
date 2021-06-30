import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome = "";
        double nota1, nota2, media;
        while(!nome.equals("fim"))
        if (nome != "fim"){
        System.out.print("Digite o nome do aluno: ");
        nome = ler.next();
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = ler.nextInt();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = ler.nextInt();
        media = (nota1 + nota2) /2;
        System.out.println("A média do " +nome + " é de: " + media);
        System.out.println("Se você quiser saber média de outro aluno, digite o seu nome. Caso contrário, escreva a palavra fim.");
        }
    }
}