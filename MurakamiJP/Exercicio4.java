import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        float media;

        System.out.println("Informe o nome do aluno: ");
        String nome = teclado.next();

        System.out.println("Informe a primeira nota do aluno: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Informe a segunda nota do aluno: ");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Informe a terceira nota do aluno: ");
        float nota3 = teclado.nextFloat();

        media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10 ;
        
        System.out.print("Aluno: " + nome);
        System.out.print("\n");
        
        System.out.print("Primeira nota (Peso 5,0): " + nota1);
        System.out.print("\n");
        
        System.out.print("Segunda nota (Peso 3,0): " + nota2);
        System.out.print("\n");
        
        System.out.print("Terceira nota (Peso 2,0): " + nota3);
        System.out.print("\n");
        
        System.out.print("A media ponderada do aluno é: " + media);
        
        teclado.close();
    }
}