import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número de 0 a 20: ");
    int a = teclado.nextInt();
    int b = 8;
    int c = 0;
    int d = 0;
    for (int i = 1; i <= a; i++) {
        c = b + 2;
        d = b * 2;
        b = d;
        System.out.println(c);
        System.out.println(d);
    }
    teclado.close(); 
    }
}

