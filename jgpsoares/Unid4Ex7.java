import java.util.Scanner;

public class Unid4Ex7 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o peso da carta em gramas: ");
        float pesoCarta = teclado.nextFloat();
        float pesoCartaMaior = ((pesoCarta - 50) / 20);
        float precoCartaMaior =(float) (0.45 + (0.45 * pesoCartaMaior ));
        int cartaMaior;
        if (pesoCartaMaior < 0) {
            precoCartaMaior = (float) 0.45;
        }
        if (pesoCarta <= 50) {
            System.out.println("O custo total do selo será de: R$ 0.45");
        }
        else if (pesoCartaMaior % 1 != 0) {
            cartaMaior = Math.round(pesoCartaMaior);
            System.out.println("O custo total do selo será de: R$" + (0.45 +(cartaMaior * 0.45)));
        }
    }
}    