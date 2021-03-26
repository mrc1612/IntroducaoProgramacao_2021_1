import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Valor do dolar: ");
        float dolar = keyboard.nextFloat();

        System.out.print("Valor entregue em dolar: ");
        float valorEntregue = keyboard.nextFloat();

        float cont = (float) (dolar * valorEntregue);

        System.out.print("Valor entregue em reais para o cliente: "+ cont);
    }
}