import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        System.out.println("Informe o primero número:");
        n1 = ler.nextInt();
        System.out.println("Informe o segundo número:");
        n2 = ler.nextInt();
        if(n1 > n2 && n1 % n2 == 0){
            System.out.println("Esses numeros sao multiplos");
        }else{
            if(n2 > n1 && n2 % n1 == 0){
            System.out.println("Esses numeros sao multiplos");
        }else{
            System.out.println("Esses numeros nao sao multiplos");
        }
    }    }}
