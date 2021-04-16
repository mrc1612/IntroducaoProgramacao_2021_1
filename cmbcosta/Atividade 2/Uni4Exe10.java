import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade Marquinhos");

        double idadeMarquinhos = scanner.nextDouble();

        System.out.println("Idade luluzinha");

        double idadeLuluzinha = scanner.nextDouble();

        System.out.println("Idade Zezinho");

        double IdadeZezinho = scanner.nextDouble();

        if((idadeMarquinhos < idadeLuluzinha) && (idadeLuluzinha < IdadeZezinho)){
            System.out.println("Marquinhos caçula ");
        }else if((idadeLuluzinha < idadeMarquinhos) && (idadeMarquinhos < IdadeZezinho)){
            System.out.println("Luluzinha caçula ");
        }else if((IdadeZezinho < idadeMarquinhos) && (idadeMarquinhos < idadeLuluzinha)){
            System.out.println("Zezinho caçula ");
        }


        scanner.close();
    }
}