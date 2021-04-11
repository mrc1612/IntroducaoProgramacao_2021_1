import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Uni4Exe24 
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("POR FAVOR DIGITE SOMENTE NUMEROS INTEIROS!!");
       System.out.println("Entre o primeiro valor: ");
       int valor = s.nextInt();
       System.out.println();
       System.out.println("Entre o segundo valor: ");
       int valor2 = s.nextInt();
       System.out.println();
       System.out.println("Entre o terceiro valor: ");
       int valor3 = s.nextInt();
       System.out.println();
       System.out.println("Se voce quiser em ordem crescente digite: 1");
       System.out.println("Se voce quise em ordem decrescente digite: 2");
       System.out.println("Se voce quiser que o maior valor fique no meio digite: 3");
       int numero = s.nextInt();

       TreeSet<Integer> ts1 = new TreeSet<Integer>(); //ordem crescente vem por default
       TreeSet<Integer> ts2 = (TreeSet<Integer>) new TreeSet<Integer>().descendingSet(); //ordem decrescente usa esse metodo
        

       switch(numero)
       {
           case 1:
                ts1.add(valor);
                ts1.add(valor2);
                ts1.add(valor3);

                System.out.println(ts1);
            break;
           case 2: 
                ((TreeSet<Integer>) ts2).add(valor);
                ((TreeSet<Integer>) ts2).add(valor2);
                ((TreeSet<Integer>) ts2).add(valor3);

                System.out.println(ts2);
            break;
           case 3: //Gambiarra para fazer o numero maior sempre ficar no meio nao achei um metodo para isso
           //e tambem nao queria criar um metodo comparador para a classe tree pra ficar tudo no mesmo tipo
            if(valor > valor2 && valor > valor3)
            {
                System.out.print(valor2+", ");
                System.out.print(valor+", ");
                System.out.print(valor3);
            }
            else if(valor2 > valor && valor2 > valor3)
            {
                System.out.print(valor+", ");
                System.out.print(valor2+", ");
                System.out.print(valor3); 
            }
            else if(valor3 > valor && valor3 > valor2)
            {
                System.out.print(valor2+", ");
                System.out.print(valor3+", ");
                System.out.print(valor);
            }
            
       }


    }    
    
    }

