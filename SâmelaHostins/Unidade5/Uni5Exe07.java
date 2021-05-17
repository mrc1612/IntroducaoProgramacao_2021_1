/*Descreva um algoritmo que leia um número inteiro n e, 
dados n números reais informe o maior e o menor número.*/
import java.util.Scanner;
public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        System.out.println("Informe um numero: ");
        int n = ler.nextInt();
        int menor = 1000;
        for (int i=1; i<= n; i++){
           System.out.println("Informe outro numero: ");
           int n2 = ler.nextInt();
    
            if (n2 >= maior) {
                maior = n2;
            }
     
            if (n2 <= menor) {
                menor = n2;
            }}
System.out.println("O maior numero é: "+ maior);
System.out.println("O menor numero é: "+ menor);
    }}
    