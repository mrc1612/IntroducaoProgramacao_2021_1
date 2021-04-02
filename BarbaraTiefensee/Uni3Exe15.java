import java.util.*;

public class Uni3Exe15 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3; 
        double centena;
        double dezena;
        double unidade = 0;

        System.out.print("Escreva um numero de 3 digitos: ");

        numero1 = teclado.nextInt();

        centena = numero1 / 100;
        numero2 = (numero1 - (centena * 100));
        dezena = numero2 / 10;
        numero3 = (numero2 - (dezena * 10));
        unidade = numero3 / 1;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
    }
}
