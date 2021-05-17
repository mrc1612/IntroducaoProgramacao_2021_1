import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int idade1, idade2, idade3;

        System.out.println("Informe a data de nascimento do 1º irmão (aaaa): ");
        idade1 = teclado.nextInt();
        System.out.println("Informe a data de nascimento do 2º irmão (aaaa): ");
        idade2 = teclado.nextInt();
        System.out.println("Informe a data de nascimento do 3º irmão (aaaa): ");
        idade3 = teclado.nextInt();

        if (idade1 == idade2 && idade1 == idade3) {
            System.out.println("São trigêmeos!");

        } else {
            if (idade1 == idade2 &&  idade1 != idade3) {
            System.out.println("O 1º e o 2º são gêmeos!");
        } else {
            if (idade2 == idade3 && idade2 != idade1) {
            System.out.println("O 2º e o 3º são gêmeos!");
        } else {
            if (idade3 == idade1 && idade3 != idade2) {
            System.out.println("O 1º e o 3º são gêmeos");
        } else {
            System.out.println("Todos são apenas irmãos!");
        }
        }
        }
        }

    }
}
