package atividadesfurbifelse;

import java.util.Scanner;

public class atividade24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int maiorValor = 0;

        int menorvalor = 0;

        int meio = 0;

        System.out.println("Informe três valores com espaços entre eles: ");

        int primeiro = sc.nextInt();

        int segundo = sc.nextInt();

        int terceiro = sc.nextInt();

        System.out.println("Informe o valor 1,2 ou 3");

        int valor = sc.nextInt();


        if(primeiro > segundo && primeiro > terceiro){ //Maior

             maiorValor = primeiro;

        }       else if(segundo > primeiro && segundo > terceiro){

                      maiorValor = segundo;

                } else {

                     maiorValor = terceiro;

        } //Menor

            if(primeiro < segundo && primeiro < terceiro){

             menorvalor = primeiro;

        } else if(segundo < primeiro && segundo < terceiro){

             menorvalor = segundo;

        } else {

             menorvalor = terceiro;

        }
            //Meio
            if(primeiro > segundo && primeiro < terceiro || primeiro > terceiro && primeiro < segundo){

                 meio = primeiro;

        } else if(segundo > primeiro && segundo < terceiro || segundo > terceiro && segundo < primeiro){

             meio = segundo;

        } else {

             meio = terceiro;

        }

        if(valor >= 1 && valor <= 3){

            if(valor == 1){

                System.out.printf("Ordem crescente: %d, %d, %d",menorvalor,meio,maiorValor);

            } else if(valor == 2){

                System.out.printf("Ordem decrescente: %d, %d, %d",maiorValor,meio,menorvalor);

            }  else if(valor == 3) {

                System.out.printf("Maior valor no meio: %d, %d, %d",meio,maiorValor,menorvalor);

            }

        } else {

            System.out.println("Valor não existe");

        }

        sc.close();

    }
    
}
