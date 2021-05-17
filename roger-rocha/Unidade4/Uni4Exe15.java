import java.util.Scanner;

public class Uni4Exe15 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Irei fazer um reajuste no seu salario");
        System.out.println("Por favor me informe o seu salario: ");
        float salario = teclado.nextFloat();
        System.out.println("Por favor me informe quantos meses fazem que voce foi admitido");
        int meses = teclado.nextInt();
        float reajuste;
        if(meses <= 12)
        {
            System.out.println("O valor do reajuste sera de: " + (salario * 0.05));
        }
        else
        {
            System.out.println("O valor do reajuste sera de: " + (salario * 0.07));
        }

    }    
}
