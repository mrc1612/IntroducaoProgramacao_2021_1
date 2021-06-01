import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni6Exe10 
{
    public static void main(String[] args) 
    {
        new Uni6Exe10(); //  MEU LOOP ESTA ERRADO ELE NAO SAI DO LOOP DE ADD MESMO COM BREAK
                        // PRECISA DO ADD PRA FAZER AS OUTRAS OPCOES FAZER O ADD POR FORA EM OUTRO LOOP E PERGUNTAR SE QUER ADD MAIS OU NAO DEPOIS 
                        // IR PARA O OUTRO LOOP DE MENU
    }
    public Uni6Exe10()
    {
        ArrayList arrayList = new ArrayList();
        escolherOpcoes(arrayList);
        int[] opa = new int[4];
    }
    
    public void escolherOpcoes(ArrayList arrayList)
    {
        Scanner sc = new Scanner(System.in);
        String opcaoUsuario = opcoes();
        do
        {
            switch(opcaoUsuario)
            {
                case "1":
                    addArray(arrayList);
                break;
                case "2":
                    System.out.println("Digite um valor pra ver se ele esta contido no vetor:");
                    int contido = sc.nextInt();
                    if(arrayList.contains(contido))
                    {
                        System.out.println("Esse numero " + contido + " esta contido no vetor");
                    }
                    else 
                        System.out.println("Esse numero " + contido + " nao esta contido no vetor");
                    break;
                case "3": 
                System.out.println("Digite um valor pra ser trocado no vetor:");
                int trocar = sc.nextInt();
                if(arrayList.contains(trocar))
                {
                    System.out.println("Insira um novo numero");
                    int numeroNovo = sc.nextInt();
                    int i=0;
                    while(arrayList.get(i) != ((Object) trocar))
                    {
                        i++;
                    }
                    arrayList.set(i , numeroNovo);
                }
                else
                    System.out.println("Esse numero nao esta no vetor, Digite outro:");
                    break;
                case "4":
                    System.out.println("Digite um numero para excluir do vetor");
                    int excluir = sc.nextInt();
                    if(arrayList.contains(excluir))
                    {
                        arrayList.remove(excluir);
                        System.out.println("numero excluido com sucesso do vetor");
                    }
                    else 
                        System.out.println("Esse numero nao esta contido na array");
                    break;
                case "5":
                    System.out.println(arrayList);
                    break;
                case "6":
                    Collections.sort(arrayList);
                    System.out.println(arrayList);
                    break;
                default:
                    System.out.println("Escolha uma das opcoes de 1-7");
            }
    }while(!opcaoUsuario.equals("7"));
    }
    public String addArray(ArrayList arrayList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros queres adicionar ao vetor:");
        int numero = sc.nextInt();
        for(int i=0; i<numero; i++)
        {
            System.out.println("Digite um numero para ser inserido no vetor:");
            arrayList.add(sc.nextInt());
        }
        return opcoes();
    }
    public String opcoes()
    {
        System.out.println("Digite o numero da sua opcao:");
        System.out.println("");
        System.out.println("1 – Incluir valor");
        System.out.println("2 – Pesquisar valor");
        System.out.println("3 – Alterar valor");
        System.out.println("4 – Excluir valor");
        System.out.println("5 – Mostrar valores");
        System.out.println("6 – Ordenar valores");
        System.out.println("7 – Sair do sistema");

        Scanner sc = new Scanner(System.in);
        String opcaoUsuario = sc.nextLine();
        return opcaoUsuario;
    }    
}
