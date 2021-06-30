import java.util.Scanner;

public class Unid4Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float numero = teclado.nextFloat();
        if (numero > 0) {
            if (numero % 1 == 0) {
                System.out.println("Não foram informadas casas decimais.");
            }
            else {
                System.out.println("O número possui casas decimais.");
            }
        }
        else {
            System.out.println("O número digitado deve ser maior do que 0.");
        }
    }   
}