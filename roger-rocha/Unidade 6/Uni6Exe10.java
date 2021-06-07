import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Uni6Exe10 
{
    int opcao = 0;
    Scanner sc = new Scanner(System.in);
    int size = 5;
    int[] vetor = new int[size];
    ArrayList arrayList = new ArrayList();
    public static void main(String[] args) 
    {
        new Uni6Exe10();
    }
    public Uni6Exe10()
    { 
     leituraInicial();   
    } 
    public void leituraInicial() {
        System.out.println("Informe os 5 primeiros valores do vetor: ");
        for (int i = 0; i < size; i++) {
            int cv = sc.nextInt();
            arrayList.add(cv);
        }
        menu();
    }

    public void menu() {
        do {
            System.out.println("Escolha uma das opcoes abaixo: ");
            System.out.println("");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Sair do sistema");
            System.out.println("");
            opcao = sc.nextInt();
        } while (validarOpcoes(opcao) == false);
        opcoes(opcao);
    } 
    public boolean validarOpcoes(int opcao) {
        if (opcao < 1 || opcao > 7) {
            return false;
        }
        return true;
    }
    
    public void opcoes(int opcao) {
        if (opcao != 7) {
            switch (opcao) {
                case 1:
                    addArray(arrayList);
                    break;
                case 2:
                    pesquisarValor(arrayList);
                    break;
                case 3:
                    alterarValor(arrayList);
                    break;
                case 4:
                    excluirValor(arrayList);
                    break;
                case 5:
                    mostrarValores(arrayList);
                    break;
                case 6:
                    ordenarValores(arrayList);
                    break;
                default:
                    break;
            }
            menu();
        }
    }
        public void addArray(ArrayList arrayList)
        {
            System.out.println("Digite um numero para ser inserido no vetor:");
            int num = sc.nextInt();
            if(arrayList.contains(num))
            {
                System.out.println("Esse numero ja esta inserido no vetor, Digite outro numero");
                num = sc.nextInt();
                arrayList.add(num);
                return;
            }
            else
                arrayList.add(num);
            
        }

        public void pesquisarValor(ArrayList arrayList)
        {
            System.out.println("Informe o numero que deseja pesquisar:");
            int search = sc.nextInt();
            if(arrayList.contains(search))
            {
                int index1 = arrayList.indexOf(search);
                System.out.println("Esse numero " + search + " esta contido no vetor e esta na posicao " + index1);
            }
            else 
            System.out.println("Esse numero " + search+ " nao esta contido no vetor");
        }

        public void alterarValor(ArrayList arrayList)
        {
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
        }

        public void excluirValor(ArrayList arrayList)
        {
            System.out.println("Digite um numero para excluir do vetor");
                    int excluir = sc.nextInt();
                    if(arrayList.contains(excluir))
                    {
                        
                        int index = arrayList.indexOf(excluir);
                        arrayList.remove(index);
                        System.out.println("numero excluido com sucesso do vetor");
                    }
                    else 
                        System.out.println("Esse numero nao esta contido na array");
        }

        public void mostrarValores(ArrayList arrayList)
        {
            System.out.println(arrayList);
        }
        public void ordenarValores(ArrayList arrayList)
        {
            Collections.sort(arrayList);
            System.out.println(arrayList);
        }

}
