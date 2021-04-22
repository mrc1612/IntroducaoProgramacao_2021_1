import java.util.Scanner;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int datapag,datavenc, valor;

        System.out.println("Informe o dia do vencimento:");
        datavenc = teclado.nextInt();

        System.out.println("Informe o dia do pagamento:");
        datapag = teclado.nextInt();

        System.out.println("Informe o valor da parcela:");
        valor = teclado.nextInt();

        if (datapag < datavenc) 
        {
            System.out.println("Será aplicado um valor de 10% de desconto em cima de sua prestação, que ficará: R$" +(valor - (valor*0.01)));
        }
        else if (datapag - datavenc <= 5 && datapag - datavenc >=1) 
        {
            System.out.println("O pagamento está atrasado, porém não será cobrado multa, R$ "+valor+"");
        }
        else if (datapag - datavenc > 5) 
        {
            System.out.println("O pagamento está atrasado mais de 5 dias, o valor final será de: R$" + (valor + (valor * 0.02 * (datapag - datavenc))));
        }
        
        teclado.close();

    }
}
