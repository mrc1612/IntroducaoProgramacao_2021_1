import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe02 
{   double media = 0;
    public static void main(String[] args) 
    {
        new Uni6Exe02();
    }   
    
    public Uni6Exe02()
    {
        double[] array = new double[12];
        double soma = lerArray(array);
        double media = calculaMedia(soma, array.length);
        valoresAcimaDaMedia(array, media);
    }
    public double lerArray(double[] array)
    { 
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < array.length; i++)
        {    
            System.out.println("Insira o numero:");
            array[i] = sc.nextDouble(); 
            soma += array[i];
        }
        sc.close();
        return soma;

    }
    public double calculaMedia(double soma, int arraySize)
    {
        
        media = soma / arraySize;     
        System.out.println("A media eh de: " +media);

        return media;
    }
    public void valoresAcimaDaMedia(double[] array, double media)
    {
        ArrayList<Double> arr = new ArrayList<>();
        for(int x=0; x<array.length; x++)
        {
            if(array[x] > media)
            {
                arr.add(array[x]);
            }
        }
        System.out.println("Esses valores estao acima da media:" + arr);
    }
}
