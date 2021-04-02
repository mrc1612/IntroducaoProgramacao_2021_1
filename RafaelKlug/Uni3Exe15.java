import java.util.Scanner;

public class Uni3Exe15 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, cent, dez, uni;
        System.out.print("Informe um número (máximo de 3 dígitos): ");
        n1 = teclado.nextInt();
        cent = (n1 / 100);
        n2 = (n1 - (cent * 100));
        dez = (n2 / 10);
        n3 = (n2 - (dez * 10));
        uni = (n3 / 1);
        System.out.println("Centena: " + cent);
        System.out.println("Dezena: " + dez);
        System.out.println("Unidade: " + uni);

        teclado.close();
    }
}
    
