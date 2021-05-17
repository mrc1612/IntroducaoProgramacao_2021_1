package AtividadesFurb;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Informe a quantidade de latas de 350ml você quer: ");

        int valor1 = sc.nextInt();
            
        System.out.println("Informe a quantidade de latas de 600ml você quer: ");

        int valor2 = sc.nextInt();

        System.out.println("Informe a quantidade de latas de 2 litros você quer: ");


        int valor3 = sc.nextInt();
        
        valor1 = valor1 * 350;
        valor2 = valor2 * 600;
        valor3 = valor3 * 2000;

        int soma = valor1 + valor2 + valor3;

        System.out.println(soma);
        


        sc.close();






      
    }
    
}
