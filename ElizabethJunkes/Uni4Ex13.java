import java.util.Scanner;

public class Uni4Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("[1] = As");
        System.out.println("[2] = 2");
        System.out.println("[3] = 3");
        System.out.println("[7] = 7");
        System.out.println("[11] = Valete");
        System.out.println("[12] = Dama");
        System.out.println("[13] = Rei");
        System.out.print("Informe o valor de suas 3 cartas. Primeiro, digite o valor da sua primeira carta: ");
        int carta1 = teclado.nextInt();
        System.out.print("Digite o valor da segunda carta: ");
        int carta2 = teclado.nextInt();
        System.out.print("Digite o valor da terceira carta: ");
        int carta3 = teclado.nextInt();
        String t = (String) ("Truco.");
        String s = (String) ("Seis.");
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(t);
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(t);
        }
        if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(t);
        }
        if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)) {
            System.out.println(s);
        }
        else if((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(s);
        }
        else if((carta1 != 1 && carta1 != 2 && carta1 != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)) {
            System.out.println(s);
        }
        if(((carta1 == 1 || carta1 == 2 || carta1 == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))) {
            System.out.println("Nove.");
        }        
    }    
}
