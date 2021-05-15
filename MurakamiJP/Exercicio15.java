import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);    

        int n = teclado.nextInt();

        int centenas = n/100;
        n -= cent*100;

        int dezenas = n/10;
        n -= deze*10;

        System.out.println(cent + " centena(s)  " + deze +" dezena(s) " + n + " unidade(s)");

        teclado.close();
    }
}
