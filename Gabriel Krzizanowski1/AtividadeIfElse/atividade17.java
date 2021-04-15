package atividadesfurbifelse;

import java.util.Scanner;

public class atividade17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua renda liquida anual: ");

        double rendaLiquida = sc.nextDouble();

        System.out.println("Informe a quantidade de dependentes: ");

        int dependentes = sc.nextInt();

        if(rendaLiquida >0 && rendaLiquida <=2000){

            System.out.println("Não paga imposto");

        } else if(rendaLiquida >2000 && rendaLiquida <=5000){

            if(dependentes >0){

              double  porcentagem = 0.02;

              double valorPorfilho = porcentagem * dependentes;

              double valorDoDesconto = valorPorfilho - 0.05;

              double calculo = rendaLiquida - (valorDoDesconto * rendaLiquida);

                if(valorDoDesconto <0){

                  System.out.println(rendaLiquida);

                } else{

                 

                  System.out.println(calculo);

                }
              

            }

        }

    }
    
}
