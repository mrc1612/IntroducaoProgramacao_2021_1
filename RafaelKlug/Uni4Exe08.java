import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        System.out.println("Informe a letra: ");
        char letra = tec.next().charAt(0);

        if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        tec.close();
    }
}
