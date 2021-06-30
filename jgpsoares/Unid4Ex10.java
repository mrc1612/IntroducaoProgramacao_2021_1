import java.util.Scanner;

public class Unid4Ex10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a idade de Marquinhos: ");
        double idade_marquinhos = teclado.nextDouble();
        System.out.print("Informe a idade de Zezinho: ");
        double idade_zezinho = teclado.nextDouble();
        System.out.print("Informe a idade de Luluzinha: ");
        double idade_luluzinha = teclado.nextDouble();
        if ((idade_marquinhos < idade_zezinho) && (idade_marquinhos < idade_luluzinha)) {
            System.out.println("Marquinhos é o irmão caçula.");
        }
        else {
                if (idade_zezinho < idade_luluzinha) {
                    System.out.println("Zezinho é o irmão caçula.");
                }
                else {
                    System.out.println("Luluzinha é a irmã caçula.");
                }
            }
        teclado.close();
    }
 }