import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uni6Exe07  
{
    public static void main(String[] args) 
    {
      new Uni6Exe07();   
    }

    public Uni6Exe07()
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while(true) {
            System.out.print("Informe um valor maior q 0 e até 20: "); 
            numero = scanner.nextInt();

            if (numero > 0 && numero <= 20) {
                break;
            } else {
                System.out.println("Número inválido");
            }
        }
        float[] array = new float[numero];
        readyValues(array, numero);
        scanner.close();
    }


    public void readyValues(float[] array, int vetorSize)
    {   
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<vetorSize; i++)
        {
            System.out.println("Insira os numeros para completar o vetor, por favor nao repetir numeros!");
            int entrada = scanner.nextInt();
            if(arrayList.contains(entrada))
            {
                System.out.println("Numero ja esta contido digite outro por favor");
                entrada = scanner.nextInt();
                arrayList.add(entrada);
            }
            else
                arrayList.add(entrada);
                  
        }
        Collections.sort(arrayList); 
        System.out.println(arrayList);   
        
        scanner.close();
    }
}
