/*Descreva um algoritmo que leia um número inteiro n e, dados n 
números inteiros, descreva um algoritmo que:

- escreva o menor valor negativo;
- escreva a média dos números positivos.*/
import java.util.Scanner;
public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n2=0;
        int i; 
        double soma = 0;
        int menor = 0;
        int numerosPositivos =0;
        System.out.println("Informe a quantidade de numeros que você fornecerá: ");
        int n = ler.nextInt();
        for (i=1; i<= n; i++){
           System.out.println("Informe outro numero: ");
           n2 = ler.nextInt();

           if(n2 >= 0){ // se o número digitado for MAIOR que zero, executa a conta
            soma = n2 + soma; // soma o valor digitado AGORA com o digitado ANTES
            numerosPositivos++; // conta quantos números positivos tem
        }
        //Achando o menor número negativo
        if (n2 <= menor) {
            menor = n2;
            
        }}
    System.out.println("A média dos número positivos é de " + soma / numerosPositivos); // média
    System.out.println("O menor valor negativo é:" + menor);
}
} 
    

