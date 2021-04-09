package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if(valor > valor2){
            System.out.println(valor + " maior que " + valor2);;
        }
        else if(valor2 > valor){
            System.out.println(valor2 + " maior que " + valor);;
        }
        else{
            System.out.println("valores iguais");
        }
    }
}
