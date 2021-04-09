package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor = scanner.nextFloat();

        if(valor != (int)valor){
            System.out.println("tem parte decimal");
        }
        System.out.println(valor);
        scanner.close();
    }
}
