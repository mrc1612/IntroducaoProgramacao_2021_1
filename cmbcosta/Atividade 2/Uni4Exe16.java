import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Dígite a idade do homem 1: ");

        int homem = scanner.nextInt();
        System.out.println("Dígite a idade do homem 2: ");

        int homem1 = scanner.nextInt();

        System.out.println("Dígite a idade da mulher 1: ");

        int mulher = scanner.nextInt();

        System.out.println("Dígite a idade da mulher 2: ");

        int mulher1 = scanner.nextInt();

        if((homem > homem1) && (mulher > mulher1)){
            System.out.println(homem + mulher1);
            System.out.println(homem1 * mulher);
        }else if((homem1 > homem) && (mulher1 > mulher)){
            System.out.println(homem1 + mulher);
            System.out.println(homem * mulher1);
        }else if((homem1 > homem) && (mulher > mulher1)){
            System.out.println(homem1 + mulher1);
            System.out.println(homem * mulher);
        }else if((homem > homem1) && (mulher1 > mulher)){
            System.out.println(homem + mulher);
            System.out.println(homem1 * mulher1);
        }

        scanner.close();
    }
}