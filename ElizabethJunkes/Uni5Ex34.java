import java.util.Scanner;
public class Uni5Ex34 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int opcao, contasEncerradas = 0; double pagar = 0;
        do {
            System.out.print("O que você deseja fazer? ");
            System.out.println();
            System.out.print("(1) encerrar a conta de um hóspede");
            System.out.println();
            System.out.print("(2) verificar número de contas encerradas");
            System.out.println();
            System.out.print("(3) sair");
            System.out.println();
            opcao = ler.nextInt();
             switch (opcao) {
                 case 1:
                    System.out.println("Qual o seu nome?");
                    String nome = ler.next();
                    System.out.println("Informe seu número de diárias");
                    int diaria = ler.nextInt();
                     contasEncerradas ++;
                 if (diaria < 15) {
                    pagar = (7.50*diaria) + 50;
                 }
                 if (diaria == 15) {
                    pagar = (6.50*diaria) + 50;
                }
                if (diaria > 15) {
                    pagar = (5*diaria) + 50;
                }
                System.out.println(nome + ", você deve pagar R$ " + pagar);
                    break;
                 case 2:                 
                    System.out.println(contasEncerradas + " contas foram encerradas.");
                    break;
            }
           }   while(opcao != 3);
}
}