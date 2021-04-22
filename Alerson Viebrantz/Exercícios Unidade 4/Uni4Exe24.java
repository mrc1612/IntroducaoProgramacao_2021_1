import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        int n1, n2, n3, opcao, nmai, nmen, nmei;

        System.out.println("Informe o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.println("Informe o primeiro número: ");
        n2 = teclado.nextInt();
        System.out.println("Informe o primeiro número: ");
        n3 = teclado.nextInt();

        System.out.println("Informe a opção: ");
        System.out.println("opção = 1, os 3 valores em ordem crescente");
        System.out.println("opção = 2, os 3 valores em ordem decrescente");
        System.out.println("opção = 3, os 3 valores de forma que o maior valor fique no meio");
        opcao = teclado.nextInt();

        /* número maior*/
        if (n1 > n2 && n1 > n3) {
            nmai = n1;
        } 
        else if (n2 > n1 && n2 > n3) {
            nmai = n2;
        }
        else if (n3 > n1 && n3 > n2) {
            nmai = n3;
        }

        /*número menor*/
        if (n1 < n2 && n1 < n3) {
            nmen = n1;
        } 
        else if (n2 < n1 && n2 < n3) {
            nmen = n2;
        }
        else if (n3 < n1 && n3 < n2) {
            nmen = n3;
        }

        /*número central*/

        if (n1 != n2 && n1 != n3) {
            nmei = n1;
        } 
        else if (n2 != n1 && n2 != n3) {
            nmei = n2;
        }
        else if (n3 != n1 && n3 != n2) {
            nmei = n3;
        }

        switch (opcao) {
            case (1):
                System.out.println(""+nmen+"");
                System.out.println(""+nmei+"");
                System.out.println(""+nmai+"");
            break;

            case (2):
                System.out.println(""+nmai+"");
                System.out.println(""+nmei+"");
                System.out.println(""+nmen+"");
            break;

            case (3):
                System.out.println(""+nmei+"");
                System.out.println(""+nmai+"");
                System.out.println(""+nmen+"");
            break;

            default:
            System.out.println("inválido!");

        }

        teclado.close();
    }
}

