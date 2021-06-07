import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real.
// Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário.
// Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).
public class Uni6Exe08
{
    public static void main(String[] args) //PROBLEMA COM PEGAR A FREQUENCIA DOS NUMEROS
    {
        new Uni6Exe08();
    }

    public Uni6Exe08()
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Defina um tamanho para o vetor:");
       int vetorSize = sc.nextInt();
       if(vetorSize > 20)
       {
           System.out.println("Nao pode ser maior que 20 coloque outro numero");
           vetorSize = sc.nextInt();
       }
       double[] numeros = new double[vetorSize];
       ArrayList<Double> array = new ArrayList();
       int count = 0; 
      lerNumeros(vetorSize, array);
      printarTable(vetorSize, array, count);  
    }
    public void lerNumeros(int vetorSize, ArrayList array)
    {
        double num = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < vetorSize; i++)
        {
            System.out.println("Insira numeros para preencher o vetor:");
            num = sc.nextDouble();
            array.add(num);
        }
    }
    public void printarTable(int vetorSize, ArrayList array, int count)
    {
        String leftAlignFormat = "| %-15s | %-4d |%n";
        int[] frequencia = new int[vetorSize];
        for(int x=0; x < vetorSize; x++)
        {
            frequencia[x] = Collections.frequency(array, array.get(x));
        }
        System.out.format("+-----------------+------+%n");
        System.out.format("| Numero Vetor    |  X   |%n");
        System.out.format("+-----------------+------+%n");
        Set<Double> set = new HashSet<>(array);
        array.clear();
        array.addAll(set);
        for (int i = 0; i < vetorSize; i++) 
        {

            System.out.format(leftAlignFormat, array.get(i), frequencia[i]);
        }
        System.out.format("+-----------------+------+%n");
    }
}

