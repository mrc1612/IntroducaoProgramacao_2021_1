import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        int carta1, carta2, carta3;

        System.out.println("Informe a 1ª carta (1 = AS; 2 = 2; 3 = 3; 11 = Valete; 12 = Dama; 13 = Rei): ");
        carta1 = teclado.nextInt();
        System.out.println("Informe a 2ª carta (1 = AS; 2 = 2; 3 = 3; 11 = Valete; 12 = Dama; 13 = Rei): ");
        carta2 = teclado.nextInt();
        System.out.println("Informe a 3ª carta (1 = AS; 2 = 2; 3 = 3; 11 = Valete; 12 = Dama; 13 = Rei): ");
        carta3 = teclado.nextInt();

        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println("TRUCOOOOOOOO!");
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println("TRUCOOOOOOOO!");
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println("TRUCOOOOOOOO!");
        }
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println("SEEEEISSSSSSS!");
        }
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println("SEEEEISSSSSSS!");
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println("SEEEEISSSSSSS!");
        }
        if(((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))) {
            System.out.println("NOOOOOOVEEEEEEE!");
        } 


 }
}
