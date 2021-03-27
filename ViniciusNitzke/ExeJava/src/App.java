import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float nota, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota = teclado.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = teclado.nextFloat();

        media = (nota + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.print("Aprovado! Media: "+ media);
        } else {
            System.out.print("Reprovado! Media: "+ media);
        }
    }
}
