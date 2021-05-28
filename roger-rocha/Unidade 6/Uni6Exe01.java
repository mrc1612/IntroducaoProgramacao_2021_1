import java.lang.reflect.Array;
import java.util.Scanner;

public class Uni6Exe01 
{

    
    public static void main(String[] args) 
    {
        new Uni6Exe01();
    } 
    public Uni6Exe01()
    {
        int[] array = new int[10];
        lerArray(array);
        escreverArray(array);    
    }
        
    public void lerArray(int[] array)
    {
       Scanner sc = new Scanner(System.in);
       for(int j=0; j < array.length; j++)
       {
           System.out.println("Insira o numero:");
           array[j] = sc.nextInt();         
       }
    }

    public void escreverArray(int[] array)
    {
        for(int x= 0; x < array.length; x++)
        {
            System.out.println(array[9-x]);
        } 
    }
        
}
