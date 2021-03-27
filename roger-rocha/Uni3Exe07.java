import java.util.Scanner;

public class Uni3Exe07 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int lata350, garrafa600, pet2l;
        System.out.println("Informe quantas latas de de 350ml foram compradas: ");
        lata350 = teclado.nextInt();
        System.out.println("Infome quantas garrafas de 600ml foram compradas: ");
        garrafa600 = teclado.nextInt();
        System.out.println("Informe quantas garrafas de 2L foram compradas: ");
        pet2l = teclado.nextInt();
        System.out.println("O total em Litros de refrigerante comprado foi de : "+ ((lata350 * 0.35)+(garrafa600 * 0.60)+(pet2l *2 )));
        
    }    
}
