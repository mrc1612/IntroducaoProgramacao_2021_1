import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;



//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro.
// Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
//Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. 
//Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado.
// Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
//Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

//Vetor origem: [0][4][2][6][3]
//Vetor ordenado: [0][2][3][4][6]

//Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante.




public class Uni6Exe07 
{
    public static void main(String[] args) 
    {
      new Uni6Exe07();   
    }

    public Uni6Exe07()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insira um valor para criar o vetor:");
        int vetorSize = sc.nextInt();
        if(vetorSize > 20)
        {
            System.out.println("Numero nao pode ser maior que 20 insira novamente");
            vetorSize = sc.nextInt();
        }
        int[] array = new int[vetorSize];
        lerVetores(array, vetorSize);
    }

    public void lerVetores(int[] array, int vetorSize)
    {   
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vetorSize; i++)
        {
            System.out.println("Insira os numeros para completar o vetor, por favor nao repetir numeros!");
            int entrada = sc.nextInt();
            if(arrayList.contains(entrada))
            {
                System.out.println("Numero ja esta contido digite outro por favor");
                entrada = sc.nextInt();
                arrayList.add(entrada);
            }
            else
                arrayList.add(entrada);
                  
        }
        Collections.sort(arrayList); // colocar uma arrayList em ordem crescente
        System.out.println(arrayList);      
    }
}
