/*Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:
    R$ 7,50 por diária, caso o número de diárias seja menor que 15;
    R$ 6,50 por diária, caso o número de diárias seja igual a 15;
    R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:
    (1) encerrar a conta de um hóspede
    (2) verificar número de contas encerradas
    (3) sair
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva
 o nome e total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes 
 que deixaram o hotel (número de contas encerradas). Caso a opção escolhida seja a terceira 
 finalize a execução do algoritmo*/
import java.util.Scanner;
public class Uni5Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
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
            opcao = ler.nextInt();

             switch (opcao) {
                 case 1:
                 System.out.println("Qual o seu nome?");
                 String nome = ler.next();
                 System.out.println("Informe seu número de diárias");
                 int diaria = ler.nextInt();
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
