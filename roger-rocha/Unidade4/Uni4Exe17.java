import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni4Exe17 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM VINDO AO CALCULO DE IMPOSTO DE RENDA, AQUI VOCE CALCULA QUANTO IRA SER ROUBADO!!");
        System.out.println("Informe a sua renda anual: ");
        float rendaAnual = teclado.nextFloat();
        System.out.println("Informe quantas pessoas dependem da sua renda, o que pode diminuir o roubo");
        int dependentes = teclado.nextInt();
        float rendaLiquida = (float) (rendaAnual - ((rendaAnual * 0.02) * dependentes));

        if(rendaLiquida <= 2000)
        {
            System.out.println("Que sorte voce nao precisa pagar o imposto de renda, mas nao se preocupe ainda tudo que voce consumir vair ter uma taxa exorbitante de imposto");
        }
        else if(rendaLiquida > 2000 && rendaLiquida <= 5000)
        {
            System.out.println("Puts infelizmente voce vai ter que pagar 5% de imposto que resulta em R$:  " + (rendaLiquida * 0.05));
        }
        else if(rendaLiquida > 5000 && rendaLiquida <= 10000)
        {
            System.out.println("Puts infelizmente voce vai ter que pagar 10% de imposto que resulta em R$:  " + (rendaLiquida * 0.1));
        }
        else 
        {
            System.out.println("Puts infelizmente voce vai ter que pagar 15% de imposto que resulta em R$:  " + (rendaLiquida * 0.15));
        }
        
        


    }    
}
