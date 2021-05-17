import java.util.Scanner;

public class Uni3Exe04 {
    /* Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2). */

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();

        /*n1 = nota 1, n2 = nota 2, n3 = nota 3*/

        float media;

        media = (n1*5+n2*3+n3*2)/(5+3+2);

        System.out.println("Sua média ponderada é: " + media);

        teclado.close();
      
    }
    
}
