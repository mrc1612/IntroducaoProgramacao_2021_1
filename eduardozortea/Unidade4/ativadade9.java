package eduardozortea.Unidade4;

import java.util.Scanner;

public class ativadade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 % num2 == 0){
            System.out.println("Múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
        
        scanner.close();
    }
}
