import java.util.Scanner;
public class Uni5Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas: ");
        int qtdLinhas = ler.nextInt();
        int qtdColunas = 1, num = 1;
        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 1; j <= qtdColunas; j++) {
                System.out.print(num+" ");
                num++;
            }
        System.out.println("");
        qtdColunas++;
}}}
