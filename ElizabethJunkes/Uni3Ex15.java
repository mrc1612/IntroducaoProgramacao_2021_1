import java.util.Scanner;

public class Uni3Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, centena, dezena, unidade = 0;
        System.out.print("Informe um número de 3 dígitos: ");
        num1 = input.nextInt();
        centena = (num1 / 100);
        num2 = (num1 - (centena * 100));
        dezena = (num2 / 10);
        num3 = (num2 - (dezena * 10));
        unidade = (num3 / 1);
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
    }
}
   
