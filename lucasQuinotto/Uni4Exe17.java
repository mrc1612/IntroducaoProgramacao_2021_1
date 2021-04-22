import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        double renAnu, rendLiq, dep;

        System.out.println("Informe sua renda anual: R$ ");
        renAnu = teclado.nextDouble();
        
        System.out.println("Informe a quantidade de dependentes: ");
        dep = teclado.nextDouble();

        rendLiq = (renAnu - ((renAnu * 0.02) * dep));

        if (rendLiq <= 2000){
            System.out.println("Você não é adequo a pagar pelo imposto de renda!");
        }
        else
        {
         if (rendLiq > 2000 && rendLiq <= 5000)
        {
            System.out.println("Você irá pagar 5% em cima de sua renda líquida = R$" + (rendLiq * 0.05));
        }
        else
        {
            if (rendLiq > 5000 && rendLiq <= 10000)
            { 
            System.out.println("Você irá pagar 10% em cima de sua renda líquida = R$" + (rendLiq * 0.1));
        }
        else
        {
            System.out.println("Você irá pagar 15% em cima de sua renda líquida = R$" + (rendLiq * 0.15));
        }
        }
        }
    
    }
}
