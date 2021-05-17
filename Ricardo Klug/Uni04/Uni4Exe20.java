import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        double n1, n2, n3, n4;

        System.out.println("Digite a nota 1:");
        n1 = tec.nextDouble();
        System.out.println("Digite a nota 2:");
        n2 = tec.nextDouble();
        System.out.println("Digite a nota 3:");
        n3 = tec.nextDouble();
        System.out.println("Digite a nota 4:");
        n4 = tec.nextDouble();

        double media;
        media = (n1 + n2*2 + n3*3 + n4)/7;

        //Processo
        if (media >= 9) {
            System.out.println("Nota A");
            System.out.println("Aprovado");
        }
        if (media >= 7.5 && media < 9.0) {
            System.out.println("Nota B");
            System.out.println("Aprovado");
        }
        if (media >= 6.0 && media < 7.5) {
            System.out.println("Nota C");
            System.out.println("Aprovado");
        }
        if (media >= 4.0 && media < 6.0) {
            System.out.println("Nota D");
            System.out.println("Reprovado");
        }
        if (media < 4.0) {
            System.out.println("Nota E");
            System.out.println("Reprovado");
        }

    }
}
