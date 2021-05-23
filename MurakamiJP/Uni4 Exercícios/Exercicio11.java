import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        int irmao1, irmao2, irmao3;

         System.out.println("Informe o ano de nascimento do primeiro irmão: ");
         irmao1 = teclado.nextInt();

         System.out.println("Informe o ano de nascimento do segundo irmão: ");
         irmao2 = teclado.nextInt();

         System.out.println("Informe o ano de nascimento do terceiro irmão: ");
         irmao3 = teclado.nextInt();

         if(irmao1 != irmao2 && irmao1 != irmao3) {
            
            System.out.println("Anos informados: \n" + irmao1 + "\n" + irmao2 + "\n" + irmao3);
            System.out.println("São apenas Irmãos");
         }

         if(irmao1 == irmao2) {
            
            System.out.println("Anos informados: \n" + irmao1 + "\n" + irmao2 + "\n" + irmao3);
            System.out.println("O primeiro é gêmeo do segundo");
         }

         if(irmao2 == irmao3) {

            System.out.println("Anos informados: \n" + irmao1 + "\n" + irmao2 + "\n" + irmao3);
            System.out.println("O segundo é gêmeo do terceiro");
         }

         if(irmao1 == irmao3) {

            System.out.println("Anos informados: \n" + irmao1 + "\n" + irmao2 + "\n" + irmao3);
            System.out.println("O primero é gêmeo do terceiro");
         }

         if(irmao1 == irmao2 && irmao1 == irmao3) {

            System.out.println("Anos informados: \n" + irmao1 + "\n" + irmao2 + "\n" + irmao3);
            System.out.println("Os irmãos são Trigêmeos");
         }

         teclado.close();
    }
    
}
