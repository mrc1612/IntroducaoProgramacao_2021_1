import java.util.*;

public class Uni4Exe07 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double pesoCarta;
        double pesoCartaMaior;
        double custoTotal;
        double valorNormal = 0.45;

        System.out.println("Informe o peso da carta: ");
        pesoCarta = teclado.nextDouble();

        pesoCartaMaior = (pesoCarta - 50) / 20;
        custoTotal = 0.45 + (pesoCartaMaior * 0.45);

        if(pesoCarta > 50)
        {
            System.out.println("Valor para pagar: " + custoTotal);
        }
        else
        {
            System.out.println("Valor a pagar: " + valorNormal);
        }  
    }
}
