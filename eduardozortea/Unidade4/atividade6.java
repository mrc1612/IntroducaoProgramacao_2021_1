package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        char letra = scanner.next().charAt(0);

        if(letra == 'M' || letra == 'm'){
            System.out.println("Masculino");
        }
        else if(letra == 'F' || letra == 'f'){
            System.out.println("Feminino");
        }
        else{
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}
