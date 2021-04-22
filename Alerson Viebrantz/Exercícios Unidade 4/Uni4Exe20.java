import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        int n1, n2, n3, me, m;

        System.out.println("Nota 1: ");
        n1 = teclado.nextInt();
        System.out.println("Nota 2: ");
        n2 = teclado.nextInt();
        System.out.println("Nota 3: ");
        n3 = teclado.nextInt();
        System.out.println("Média dos exercícios: ");
        me= teclado.nextInt();

        m = (n1+(n2*2)+(n3*3)+me)/7;

        if (m > 9) 
        {
            System.out.println("A");
        }
        else 
        {
            if (m < 9 && m >= 7.5) {System.out.println("B");}
        else 
        {
            if (m < 7.5 && m >= 6) {System.out.println("C");}
        else 
        {
            if (m < 6 && m >= 4) {System.out.println("D");}
        else 
        {
            if (m < 4) {System.out.println("E");}
        
        }
        }    
        }    
        }

    }
}
