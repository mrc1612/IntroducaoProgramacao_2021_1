import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe a quantidade de linhas");
        int qtdlinha = teclado.nextInt();

        int qtdcol = 1, num = 1;

        for (int i=1; i<=qtdlinha; i++) {
            for (int a=1; a<= qtdcol; a++) {
                System.out.print(num+" ");
                num ++;

            }
            System.out.println("");
            qtdcol++;
        }
        teclado.close();

    }
}
