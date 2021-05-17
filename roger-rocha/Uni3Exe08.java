import java.util.Scanner;

public class Uni3Exe08 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float valor, dolar;
        System.out.println("Quanto que ta o dolar patrao: ");
        dolar = teclado.nextFloat();
        System.out.println("Quanto que voce gostaria de trocar: ");
        valor = teclado.nextFloat();
        System.out.println("A quantia em reais ficou: " +(dolar * valor));
    }    
}
