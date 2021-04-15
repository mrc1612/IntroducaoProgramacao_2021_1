import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso da carta em gramas: ");
        float peso = teclado.nextFloat();

        if (peso > 50){
            float calc = (float) (((peso - 50) / 20) * 0.45);
            System.out.println("O preco a ser pago é de: " + (calc + 0.45));
        }
    }
}