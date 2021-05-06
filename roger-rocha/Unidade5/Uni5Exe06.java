import java.util.Scanner;

public class Uni5Exe06 
{
    public static void main(String[] args)
    {
        float altura = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a altura das pessoas: ");
        for(int i=0; i <= 20; i++)
        {
            altura += s.nextFloat();
        }
        float media = altura / 20;
        System.out.println("A media das alturas eh de: " + media);
    }    
}
