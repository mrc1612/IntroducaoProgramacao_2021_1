// Programa Calçados

package AtividadesFurb;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do calçado");

        float valor = sc.nextFloat();

        double desconto = 12.0 / 100.0;

        double ValorFinal = valor - (desconto * valor);

        double valorDoDesconto =  valor - ValorFinal;

        System.out.println(ValorFinal);

        System.out.println(valorDoDesconto);

        sc.close();


        
    }
    
}
