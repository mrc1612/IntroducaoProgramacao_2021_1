public class Uni5Exe02 
{
    public static void main(String[] args)
    {
        int pares = 0;
        int impares = 0;
        for(int i=1; i <= 100; i++)
        { 
           if(i % 2 == 0)
           {
               pares += i;
           }
           else
           {
               impares += i;
           }
        }

        
            System.out.println("A soma dos numeros pares entre 1 e 100 eh: " + pares);
            System.out.println("A soma dos numeros impares entre 1 e 100 eh: " + impares);
            
    }

    
}
