import java.util.Scanner;

public class Uni6Exe04 
{
    public static void main(String[] args) 
    {
        new Uni6Exe04();
    }   
    
    public Uni6Exe04()
    {
        int[] array = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        lerVetores(array, array2);
        somarVetores(array, array2, array3);
        escreverVetor3(array3);
    }

    public void lerVetores(int[] array, int[] array2)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Digite um numero para a posicao "+i+" do vetor1:");
            array[i] = sc.nextInt();
            System.out.println("Digite um numero para a posicao "+i +" vetor2:");
            array2[i] = sc.nextInt();
        } 
    }

    public void somarVetores(int[] array, int[] array2, int[] array3)
    {
        for(int j=0; j<array.length; j++)
        {
            array3[j] = array[j] + array2[j];
        }
    }

    public void escreverVetor3(int[] array3)
    {
        System.out.println();
        System.out.println("Aqui esta os numeros do vetor3:");
        for(int x=0; x<array3.length; x++)
        {
            System.out.println(array3[x]);
        }
    }
}
