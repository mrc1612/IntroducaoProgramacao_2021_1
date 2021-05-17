import java.util.Scanner;

public class Uni3Exe15 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu numero para ele ser decomposto: ");
        int numero = teclado.nextInt();
        int valor = numero;

        int centena = valor / 100;
        valor = valor - (centena * 100);

        int dezena = valor / 10;
        valor = valor - (dezena * 10);

        int unidade = valor / 1;
        valor = valor - (unidade * 1);

        System.out.println(centena + " centana(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");

        
    }    
}
