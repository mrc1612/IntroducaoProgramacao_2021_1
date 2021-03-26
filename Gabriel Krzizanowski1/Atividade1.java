//Programa Area

package AtividadesFurb;

import java.util.Scanner;


public class Atividade1 {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);

    
   System.out.println("Informe a altura: ");

    int altura = teclado.nextInt();

    System.out.println("Informe a largura: ");
    
    int largura = teclado.nextInt();

    int area = altura * largura;

    System.out.println(area);

    teclado.close();




    }

    
    

    
    
}
