import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Infome a primeira nota");
        float nota1 = sc.nextFloat();
        System.out.println("Informa a segunda nota");
        float nota2 = sc.nextFloat();
        System.out.println("Informe a terceira nota");  
        float nota3 = sc.nextFloat();

        float soma = nota1*5 + nota2*3 + nota3*2;

        float media = soma/10;

        System.out.println("Sua média é " + media);
    
        sc.close();
    }
}
