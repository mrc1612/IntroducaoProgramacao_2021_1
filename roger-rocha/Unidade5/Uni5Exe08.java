import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uni5Exe08 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com determinados numeros inteiros, apos colocar todos os numeros desejados !!APERTE ((CTRL + Z) E ENTER)!! veja qual eh maior: ");
     
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //LISTA DOS NUMEROS
        while(sc.hasNextInt()) //PEGANDO DADOS ENQUANTO NECESSARIO
        {       
            arrayList.add(sc.nextInt());
        }
        Integer [] arr = arrayList.toArray(new Integer[0]);
        float soma= 0;
        float x = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                soma += arr[i];
                x++;
            }
        }
        float media = soma / x; 
        int menor = Collections.min(arrayList); //ISOLANDO MENOR NUMERO DA LISTA
        System.out.println("Os numeros que voce digitou sao esses daqui: " + arrayList);
        System.out.println("O menor numero eh: " + menor);        
        System.out.println("A media dos numeros positivos eh: " + media);        
   
        
    }    
}
