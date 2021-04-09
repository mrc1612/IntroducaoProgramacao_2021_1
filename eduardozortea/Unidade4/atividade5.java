package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = scanner.nextBoolean();

        if(resposta == true){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
