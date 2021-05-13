import java.util.Scanner;

public class Uni5Exe20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double peso = 1;
        double tempo = 0;
        double massaInicial = 0;
        System.out.println("Insira o peso do material radioativo em Kg:");
        massaInicial = sc.nextDouble();
        peso = massaInicial * 1000;
        double massaFinal = peso;
        while(peso >= 0.5)
        {
           peso = peso / 2;
           tempo += 50;   
           if(peso <= 0.5)
           {
               massaFinal = peso;
           }
        }
        System.out.println("A massa inicial foi de: " + massaInicial + " kg");
        System.out.println("O tempo necessario foi de " + tempo + " segundos");
        System.out.println("A massa final foi de: " + massaFinal + " gramas"); 
    
        
    }    
}
