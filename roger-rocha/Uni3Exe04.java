import java.util.Scanner;

public class Uni3Exe04 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        System.out.println("Por favor informe as notas ");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5)) / 10;
        System.out.println("A média do aluno é: " + media);
    }    
}
