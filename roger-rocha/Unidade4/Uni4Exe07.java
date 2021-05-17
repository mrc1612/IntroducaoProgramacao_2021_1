import java.util.Scanner;

public class Uni4Exe07 
{
    public static void main(String[] args) throws Exception
    {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor informe o peso da carta em gramas: ");
        float pesoCarta = teclado.nextFloat();
        float pesoCartaMaior = ((pesoCarta - 50) / 20);
        float precoCartaMaior =(float) (0.45 + (0.45 * pesoCartaMaior ));
        int rendoCartaMaior;

        if(pesoCartaMaior < 0)
        {
            precoCartaMaior = (float) 0.45;
        }
        
        if(pesoCarta <= 50)
        {
            System.out.println("O custo do selo sera de R$: 0.45");
        }
        else if(pesoCartaMaior % 1 != 0)
        {
            rendoCartaMaior = Math.round(pesoCartaMaior);
            System.out.println(rendoCartaMaior);
            System.out.println("O custo do selo sera de R$: " + (0.45 +(rendoCartaMaior * 0.45)));
        }
        else
        {
            //nada aqui nao
        }
        
    }    
}
