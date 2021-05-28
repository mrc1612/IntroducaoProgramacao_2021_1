import java.lang.reflect.Array;
import java.util.Scanner;

public class Uni6Exe03 
{


    public static void main(String[] args) 
    {
        new Uni6Exe03();
    }
    
    public Uni6Exe03()
    {
        double[] array = new double[12];
        lerVetores(array);
        numerosParesOuImpares(array);
        escreverArray(array, 0);
    }

    public void lerVetores(double[] array)
    {
        Scanner sc = new Scanner(System.in);
        String arrayAntiga = "";
        for(int i=0; i < array.length; i++)
        {
            System.out.println("Insira o numero:");
            array[i] = sc.nextDouble();
            arrayAntiga += array[i] + "\n";
        }
        System.out.println("A lista de numeros sem os incrementos de 2 e 3% eh essa: " + arrayAntiga);
    }

    public void numerosParesOuImpares(double[] array)
    {
        for(int j=0; j<array.length; j++)
        {
            if(j % 2 == 0)
            {
              double par = array[j];
              double incr = (par * 0.02);
              double result = incr + par;
              array[j] = result;
            }
            else
            {
                double impar = array[j];
                double incr2 = (impar * 0.05);
                double result2 = incr2 + impar;
                array[j] = result2;
            }
        }
    }

    public void escreverArray(double[] array, double impar)
    {   System.out.println("Esse sao os numeros da lista ja incrementados:");
        for(int x=0; x<array.length; x++)
        {
            System.out.println(array[x]);
        }
    }
}
