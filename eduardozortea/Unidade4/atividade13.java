package eduardozortea.Unidade4;

import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        String truco = "Truco.";
        String seis = "Seis.";
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(truco);
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(truco);
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(truco);
        }
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(seis);
        }
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(seis);
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(seis);
        }
        if(((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))) {
            System.out.println("Nove.");
        }   

        scanner.close();
    }
}     


