import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        float nota1 = teclado.nextFloat();
        float nota2 = teclado.nextFloat();
        float nota3 = teclado.nextFloat();
        
        
        
 
        System.out.println("Nota 1 "+ nota1);
        System.out.println("Nota 2 "+ nota2);
        System.out.println("Nota 3 "+ nota3);
        System.out.println("Sua média " + ((nota1*5) + (nota2*3) +(nota3*2)) /10);
 
        teclado.close();
    }
}

