import java.util.*;

public class Ex04 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("A primeria nota do aluno: ");
        nota1 = teclado.nextDouble();

        System.out.println("A segunda nota do aluno: ");
        nota2 = teclado.nextDouble();

        System.out.println("A terceira nota do aluno: ");
        nota3 = teclado.nextDouble();

        media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;

        System.out.println("A media ponderada do aluno:  " + media);


    }
}