import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uni6Exe08  
{
    public static void main(String[] args) 
    {
      new Uni6Exe08();   
    }
            int vezes = 0;
    public Uni6Exe08()
    {
        
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.print("Informe um valor maior q 0 e até 20: "); 
            int numero = scanner.nextInt();

            if (numero > 0 && numero <= 20) {
                break;
            } else {
                System.out.println("Número inválido");
            }
        }
        float[] array = new float[numero];
        readValues(array, numero);
        scanner.close();
    }


    public void readValues(float[] array, int numero)
    {   
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<numero; i++)
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
        for (int i = 0; i < array.length; i++) {
        int numero1 = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    vezes++;
                }

            }
            System.out.println("O número " + array[i] + " apareceu " + vezes + " vezes");

        }
        Collections.sort(arrayList); 

        System.out.println(arrayList);   
        
        scanner.close();
    }
}