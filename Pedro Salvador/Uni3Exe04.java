import java.util.*;

public class Uni3Exe04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in); 
        double nota1;
        double nota2; 
        double nota3;

        System.out.print("A primeira nota do aluno é: ");
        nota1 = teclado.nextDouble();

        System.out.print("A segunda nota do aluno é: ");
        nota2 = teclado.nextDouble();

        System.out.print("A terceira nota do aluno é: ");
        nota3 = teclado.nextDouble();

        System.out.println("A média ponderada é" +  (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10 );




    }  
}
