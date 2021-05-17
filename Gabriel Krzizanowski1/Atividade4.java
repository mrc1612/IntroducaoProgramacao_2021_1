
package AtividadesFurb;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do Aluno abaixo: ");

        double Nota1 = sc.nextDouble();
        double Nota2 = sc.nextDouble();
        double Nota3 = sc.nextDouble();

       
        Nota1 = Nota1 * 5;
        Nota1 = Nota2 * 3;
        Nota1 = Nota3 * 2;

        int ponderada = 10;

        double media = (Nota1 + Nota2 + Nota3) / ponderada;
        
        System.out.println(media);

        sc.close();


        
    }
    
}
