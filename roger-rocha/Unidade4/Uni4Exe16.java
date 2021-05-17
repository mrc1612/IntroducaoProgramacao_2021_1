import java.util.Scanner;

public class Uni4Exe16 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        //ENTRADA DE DADOS
        System.out.println("Informe a idade da primeira mulher");
        int idadeMulher = teclado.nextInt();
        System.out.println("Informe a idade da segunda mulher");
        int idadeMulher2 = teclado.nextInt();
        System.out.println("Informe a idade do primeiro homem");
        int idadeHomem = teclado.nextInt();
        System.out.println("Informe a idade do segundo homem");
        int idadeHomem2 = teclado.nextInt();
        String soma = "Soma do homem mais velho com a mulher mais nova eh de: ";
        String produto = "Produto do homem mais novo com a mulher mais velha eh de: ";

        //CONDICOES
        if(idadeHomem > idadeHomem2 && idadeMulher < idadeMulher2)
        {
            System.out.println(soma + (idadeHomem + idadeMulher));
            System.out.println(produto + (idadeHomem2 * idadeMulher2));
        }
        else if(idadeHomem > idadeHomem2 && idadeMulher > idadeMulher2)
        {
            System.out.println(soma + (idadeHomem + idadeMulher2));
            System.out.println(produto + (idadeHomem2 * idadeMulher));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher < idadeMulher2)
        {
            System.out.println(soma + (idadeHomem2 + idadeMulher));
            System.out.println(produto + (idadeHomem * idadeMulher2));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher > idadeMulher2)
        {
            System.out.println(soma + (idadeHomem2 + idadeMulher2));
            System.out.println(produto + (idadeHomem * idadeMulher));
        }






    }   
}
