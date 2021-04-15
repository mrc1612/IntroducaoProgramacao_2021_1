import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class Uni4Ex24 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Informe o primeiro valor: ");
       int valor = s.nextInt();
       System.out.print("Informe o segundo valor: ");
       int valor2 = s.nextInt();
       System.out.print("Informe o terceiro valor: ");
       int valor3 = s.nextInt();
       System.out.println("Para ordem crescente, digite 1");
       System.out.println("Para ordem decrescente digite 2");
       System.out.println("Para centralizar o maior valor, digite 3");
       int num = s.nextInt();
       TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
       TreeSet<Integer> ts2 = (TreeSet<Integer>) new TreeSet<Integer>().descendingSet(); 
       switch (num) {
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
           case 3: 
            if (valor > valor2 && valor > valor3) {
                System.out.print(valor2+", ");
                System.out.print(valor+", ");
                System.out.print(valor3);
            }
            else if (valor2 > valor && valor2 > valor3) {
                System.out.print(valor+", ");
                System.out.print(valor2+", ");
                System.out.print(valor3); 
            }
            else if (valor3 > valor && valor3 > valor2) {
                System.out.print(valor2+", ");
                System.out.print(valor3+", ");
                System.out.print(valor);
            }    
       }
    }
}