import java.util.Scanner;
public class Uni5Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n2 = 0;
        int i; 
        double soma = 0;
        int menor = 0;
        int numerosPositivos =0;
        System.out.print("Informe a quantidade de números que você fornecerá: ");
        int n = ler.nextInt();
        for (i=1; i<= n; i++){
           System.out.print("Informe mais um número: ");
           n2 = ler.nextInt();
           if(n2 >= 0){ 
            soma = n2 + soma;
            numerosPositivos++; 
        }
        if (n2 <= menor) {
            menor = n2;
        }}
    System.out.println("A média dos valores positivos é de: " + soma / numerosPositivos); 
    System.out.println("O menor valor negativo é:" + menor);
}
} 
    