package atividadesfurbifelse;

import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vogal = sc.nextLine();

        char a = vogal.toLowerCase().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){

            System.out.println("é vogal");

        } else{

            System.out.println("Não é vogal");

        }

sc.close();

        
    }
    
}
