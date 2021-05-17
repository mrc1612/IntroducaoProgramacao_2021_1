import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Uni5Exe07 
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
        int maior = Collections.max(arrayList); //ISOLANDO MAIOR NUMERO DA LISTA
        int menor = Collections.min(arrayList); //ISOLANDO MENOR NUMERO DA LISTA
        System.out.println("Os numeros que voce digitou foram esses daqui: " + arrayList);
        System.out.println("O maior deles eh: " + maior);
        System.out.println("O menor deles eh: " + menor);

    }    
}
