import java.util.Scanner;

public class Uni6Exe06  
{
    public static void main(String[] args) 
    {
      new Uni6Exe06();   
    }

    public Uni6Exe06()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero inteiro para criar o vetor:");
        int numero = scanner.nextInt();
        double[] array = new double[numero];
        System.out.println("Vetor com " + numero + " posicoes foi criado");
        ReadyValues(array, numero);
        scanner.close();
    }

    public void ReadyValues(double[] array, int numero)
    {
       Scanner scanner = new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Insira os numeros para popular o vetor criado:");
            array[i] = scanner.nextDouble(); 
        }
        System.out.println("Digite um numero para ver se ele esta dentro desse vetor ou nao");
        int valor = scanner.nextInt();
        boolean valor1 = true;
        for(int x=0; x<array.length; x++)
        {
            if(array[x] == valor)
            {
                valor1 = true;
            }
            else
                valor1 = false;
        }
        if(valor1 == true)
        {
            System.out.println("O numero " + valor + " esta contido nesse vetor");
        }
        else
        {
            System.out.println("O numero " + valor + " nao esta contido nesse vetor");
        }
        scanner.close();
    }
}
