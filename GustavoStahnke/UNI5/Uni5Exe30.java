import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int somaEntraram = 0;
        int somaNaoEntraram = 0;

        String sTodos = "";
        String sEntraram = "";
        String sFora = "";

        System.out.print("Informe o valor Inicial (N): ");
        int valorN = tec.nextInt();

        System.out.print("Informe o decremento (K): ");
        int decrementoK = tec.nextInt();;
        
        System.out.print("Informe o tamanho da mochila (M): ");
        int tamanhoM = tec.nextInt();

        while (valorN > 0)
        {
            if (valorN + somaEntraram <= tamanhoM)
            {
                sEntraram += Integer.toString(valorN) + " ";
                somaEntraram += valorN;
            }
            else
            {
                sFora += Integer.toString(valorN) + " ";
                somaNaoEntraram += valorN;
            }

            sTodos += Integer.toString(valorN) + " ";
            valorN -= decrementoK;
        }

        System.out.println("Elementos a serem colocados na mochila: " + sTodos);
        System.out.println("Elementos que entraram na mochila: " + sEntraram);
        System.out.println("Elementos que ficaram fora da mochila: " + sFora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaEntraram);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaNaoEntraram);

        tec.close();
    }
}