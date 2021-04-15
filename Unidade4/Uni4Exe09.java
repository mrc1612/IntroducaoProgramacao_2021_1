import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 % num2 == 0){
            System.out.println("Multiplos");
        } else{
            System.out.println("Nao sao multiplos");
        }
    }
}