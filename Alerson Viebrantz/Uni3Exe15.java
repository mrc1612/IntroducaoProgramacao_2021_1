import java.util.Scanner;
public class Uni3Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num,num2, num3, centena, dezena;

        System.out.println("Digite um número de 3 dígitos");
        num = teclado.nextInt();

        centena = (num / 100);
        num2 = (num - (centena * 100));
        dezena = (num2 / 10);
        num3 = (num2 - (dezena * 10));

        System.out.println( +centena+ "centena(s)" +dezena+ "dezena(s)" +num3+ "unidade(s)" );

        teclado.close();
    }
}