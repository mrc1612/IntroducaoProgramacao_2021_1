package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();


        if (a1 == a2 && a1 == a3 ) {
             System.out.println("São trigêmeos.");
        }
        else {
            if (a1 == a2 ) {
                System.out.println("O primeiro e o segundo são gêmeos.");
             }
             else {
                 if (a1 == a3) {
                    System.out.println("O primeiro e o terceiro são gêmeos.");  
                 }
                 else {
                     if (a2 == a3) {
                        System.out.println("O segundo e o terceiro são gêmeos.");             
                    }
                     else { 
                        System.out.println("São apenas irmãos.");
                     }
                }
            }
        }

        scanner.close();
    }
}
