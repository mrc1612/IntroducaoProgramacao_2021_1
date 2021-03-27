import java.util.Scanner;

public class Uni3Exe14 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi a distancia percorrida em Km: ");
        float distancia = teclado.nextFloat();
        System.out.println("Quanto tempo demorou a viagem em horas:");
        float horas = teclado.nextFloat();
        float velocidade = (float) (distancia / horas);
        float gas = (float) (distancia / 12);
        System.out.println("A velocidade media da viagem foi de: " + velocidade);
        System.out.println("A quantidade de gasosa gastada nessa viagem foi de: " + gas + "Litros");
        
        
    }    
}
