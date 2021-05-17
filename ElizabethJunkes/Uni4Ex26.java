import java.util.Scanner;

public class Uni4Ex26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma das opções dadas abaixo: ");
        System.out.println("T: Calcular a área de um triângulo de base b e altura h.");
        System.out.println("Q: Calcular a área de um quadrado de lado l.");
        System.out.println("R: Calcular a área de um retângulo de base b e altura h.");
        System.out.println("C: Calcular a área de um círculo de raio r.");
        System.out.println();
        char escolha = s.next().charAt(0);
        escolha = Character.toUpperCase(escolha);
        switch (escolha) {
            case 'T':
                System.out.print("Informe o comprimento da base do triangulo: ");
                int baseTriangulo = s.nextInt();
                System.out.print("Informe o comprimento da altura do triangulo: ");
                int alturaTriangulo = s.nextInt();
                int areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2);
                System.out.println();
                System.out.println("A área do triangulo é de: " + areaTriangulo);
            break;
            case 'Q':
                System.out.print("Informe o comprimento do lado do quadrado: ");
                int ladoQuadrado = s.nextInt();
                System.out.println("A área do quadradro é de: " + (ladoQuadrado * ladoQuadrado));
            break;
            case 'R':
                System.out.print("Informe o comprimento da base do retângulo: ");
                int baseRetangulo = s.nextInt();
                System.out.print("Informe o comprimento da altura do retângulo: ");
                int alturaRetangulo = s.nextInt();
                System.out.println("A área do retângulo é de: " + (alturaRetangulo * baseRetangulo));
            break;
            case 'C':
                System.out.print("Informe o comprimento do raio do círculo: ");
                int raio = s.nextInt();
                System.out.println("A área do circulo é de: " + ((raio * raio) * 3.14));
        }
    }    
}