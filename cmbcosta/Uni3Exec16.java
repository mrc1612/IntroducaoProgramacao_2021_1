import java.util.Scanner;

public class Uni3Exec16 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double valorinformado = scanner.nextDouble();
    int valor = 0;
 
    valor = (int) valorinformado / 50;
    System.out.println(valor);
    valorinformado = valorinformado %50.0;
 
    valor = (int) valorinformado / 10;
    System.out.println(valor);
    valorinformado = valorinformado %10.0;
 
    valor = (int) valorinformado / 1;
    System.out.println(valor);
    valorinformado = valorinformado %1.0;
 
    scanner.close();
    }
}