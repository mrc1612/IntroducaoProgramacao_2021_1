package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor % 2 == 0){
            System.out.println("par");
        }
        else{
            System.out.println("impar");
        }

        scanner.close();

    }
}
