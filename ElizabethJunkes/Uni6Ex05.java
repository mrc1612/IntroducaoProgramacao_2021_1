import java.util.Scanner;
public class Uni6Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 10; 
        int v [] = new int [n]; 
        int i;
        for (i = 0; i<n; i++) {
            System.out.print("Digite um número inteiro: ");
            v[i] = ler.nextInt();
        }
        for (i = n-1; i>=0; i--) {
        System.out.print(v[i] + " ");
        }
        }
    }