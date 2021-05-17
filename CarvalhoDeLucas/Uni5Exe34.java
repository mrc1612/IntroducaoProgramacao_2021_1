import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        String nome = "";
        double pagar = 0;
        int estadia = 0;
        int contDeixou = 0;

        do {

            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("Seu nome: ");
                    nome = teclado.next();
                    System.out.print("Quantos dias ficou: ");
                    estadia = teclado.nextInt();

                    if (estadia < 15) {
                        pagar = (50 * estadia) + (7.50 * estadia);
                    } else if (estadia == 15) {
                        pagar = (50 * estadia) + (6.50 * estadia);
                    } else {
                        pagar = (50 * estadia) + (5 * estadia);
                    }

                    contDeixou++;

                    System.out.println(nome + " deve pagar R$" + pagar);

                    break;

                case 2:

                    System.out.println(contDeixou + " hóspede(s) deixaram o hotel");

                    break;

            }

        } while (opcao != 3);

        teclado.close();;

    }
}
