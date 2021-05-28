import java.util.Scanner;

//Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real.
// Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor.
// Após ter preenchido o vetor, solicite que o usuário informe um outro valor real.
// Informe para o usuário se este valor informado se encontra cadastrado no vetor.
// Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.


public class Uni6Exe06  
{
    public static void main(String[] args) 
    {
      new Uni6Exe06();   
    }

    public Uni6Exe06()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro para criar o vetor:");
        int numero = sc.nextInt();
        double[] array1 = new double[numero];
        System.out.println("Vetor com " + numero + " posicoes foi criado");
        lerVetores(array1, numero);
    }

    public void lerVetores(double[] array1, int numero)
    {
       Scanner sc = new Scanner(System.in);
        for(int i=0; i<array1.length; i++)
        {
            System.out.println("Insira os numeros para popular o vetor criado:");
            array1[i] = sc.nextDouble(); 
        }
        System.out.println("Digite um numero para ver se ele esta dentro desse vetor ou nao");
        int temOuNao = sc.nextInt();
        boolean temSimOuNao = true;
        for(int x=0; x<array1.length; x++)
        {
            if(array1[x] == temOuNao)
            {
                temSimOuNao = true;
            }
            else
                temSimOuNao = false;
        }
        if(temSimOuNao == true)
        {
            System.out.println("O numero " + temOuNao + " esta contido nesse vetor");
        }
        else
        {
            System.out.println("O numero " + temOuNao + " nao esta contido nesse vetor");
        }

    }
}

