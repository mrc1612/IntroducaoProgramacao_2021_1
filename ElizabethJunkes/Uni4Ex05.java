import java.util.Scanner;

public class Uni4Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean azul = true;
        System.out.println("A cor é azul?");
        System.out.println("[S] para sim");
        System.out.println("[N] para não");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        if (letra == 'N') {
            azul = false;
            System.out.println("Não");
        }
        else if(letra == 'S') {
            azul = true;
            System.out.println("Sim");
        }
        else {
            System.out.println("Caractere digitado inválido.");
        }
    }    
}