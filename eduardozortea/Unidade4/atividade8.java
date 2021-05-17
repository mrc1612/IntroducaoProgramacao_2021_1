package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra = scanner.next().charAt(0);

        if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'
           || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("VOGAL");
        }
        else{
            System.out.println("CONSOANTE");
        }

        scanner.close();
    }
}
