import java.util.Scanner;

public class Uni4Ex06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;
        System.out.print("Informe uma letra: ");
        letra = teclado.next();
        if ("M".equals(letra.toUpperCase())) {
            System.out.println("Masculino.");
        }
        else if ("F".equals(letra.toUpperCase())) {
            System.out.println("Feminino.");
        }
        else if ("I".equals(letra.toUpperCase())) {
            System.out.println("Não informado.");
        }
        else {
            System.out.println("Entrada incorreta.");
        }
    }
    
}
