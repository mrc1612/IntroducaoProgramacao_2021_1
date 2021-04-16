import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra?");

        char letra = scanner.next().toUpperCase().charAt(0);
        
        

         if((letra == 'A' ) || (letra =='E') || (letra =='I') || (letra =='O') || (letra =='U')){
            System.out.println("É uma Vogal");
         }else{
            System.out.println("Não é uma vogal");
         };

        scanner.close();
    }
}