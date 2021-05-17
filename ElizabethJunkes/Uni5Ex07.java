import java.util.Scanner;
public class Uni5Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        System.out.println("Informe um numero: ");
        int n = ler.nextInt();
        int menor = 1000;
        for (int i=1; i<= n; i++){
        System.out.println("Informe mais um número: ");
        int n2 = ler.nextInt();
        if (n2 >= maior) {
            maior = n2;
        }
        if (n2 <= menor) {
            menor = n2;
        }
        System.out.println("O maior número é: "+ maior);
        System.out.println("O menor número é: "+ menor);
}}}
    