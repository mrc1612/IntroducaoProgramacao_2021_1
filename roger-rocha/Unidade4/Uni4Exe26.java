import java.util.Scanner;

public class Uni4Exe26 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma das opcoes abaixo: ");
        System.out.println();
        System.out.println("T : calcular a área de um triângulo de base b e altura h");
        System.out.println("Q : calcular a área de um quadrado de lado l");
        System.out.println("R : calcular a área de um retângulo de base b e altura h");
        System.out.println("C : calcular a área de um círculo de raio r");
        char opcao = s.next().charAt(0);
        opcao = Character.toUpperCase(opcao);

        switch(opcao)
        {
            case 'T':
                System.out.println("Insira o comprimento da base do triangulo: ");
                int baseTriangulo = s.nextInt();
                System.out.println("Insira o comprimento da altura do triangulo: ");
                int alturaTriangulo = s.nextInt();
                int areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2);
                System.out.println();
                System.out.println("A area do triangulo eh: " + areaTriangulo);
            break;
            case 'Q':
                System.out.println("Insira o comprimento do lado do quadrado: ");
                int ladoQuadrado = s.nextInt();
                System.out.println("A area do quadradro eh: " + (ladoQuadrado * ladoQuadrado));
            break;
            case 'R':
                System.out.println("Insira o comprimento da base do retangulo: ");
                int baseRetangulo = s.nextInt();
                System.out.println("Insira o comprimento da altura do retangulo: ");
                int alturaRetangulo = s.nextInt();
                System.out.println("A area do retangulo eh: " + (alturaRetangulo * baseRetangulo));
            break;
            case 'C':
                System.out.println("Insira o comprimento do raio do circulo");
                int raio = s.nextInt();
                System.out.println("A area do circulo eh: " + ((raio * raio) * 3.14));
        }


    }    
}
