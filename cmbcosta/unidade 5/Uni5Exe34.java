import java.util.Scanner;
public class Uni5Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao, contasEncerradas = 0; 
        double devePagar = 0;

        do {
            System.out.print("O que você deseja fazer? ");
            System.out.print("\n");
            System.out.print("(1) encerrar a conta de um hóspede");
            System.out.print("\n");
            System.out.print("(2) verificar número de contas encerradas");
            System.out.print("\n");
            System.out.print("(3) sair");
            System.out.print("\n");
            opcao = scanner.nextInt();

             switch (opcao) {
                 case 1:
                 System.out.println("Qual o seu nome?");
                 String nome = scanner.next();
                 System.out.println("Informe seu número de diárias");
                 int diaria = scanner.nextInt();
                  contasEncerradas ++;

                 if (diaria < 15){
                      devePagar = (7.50*diaria) + 50;
                 }
                 if (diaria == 15){
                     devePagar = (6.50*diaria) + 50;
                }
                if (diaria > 15){
                     devePagar = (5*diaria) + 50;
                }
                System.out.println(nome + ", você deve pagar R$" + devePagar);
                     break;
                     
                 case 2:                 
                 System.out.println(contasEncerradas + " contas foram encerradas.");
                     break;

            }
           }   while(opcao != 3);
}}