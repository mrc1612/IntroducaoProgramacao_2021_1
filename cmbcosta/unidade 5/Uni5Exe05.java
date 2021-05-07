import java.util.Scanner;

public class Uni5Exe05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe n (n>2): ");
    int n = teclado.nextInt();
    int a = 8;
    int b = 10;
    if (n > 2) {
      for (int i = 1; i <= n; i = i+2) {
        System.out.println(a);
        if(i < n) System.out.println(b);
        b = a + b;
        a = a * 2;
    }

  }
  teclado.close();
}
}
