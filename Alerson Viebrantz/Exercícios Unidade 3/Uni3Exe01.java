import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);   
        int base, altura, resultado;
        System.out.println("Digite a altura do retângulo");
        altura = teclado.nextInt();
        System.out.println("Digite a base do retângulo");
        base = teclado.nextInt();

        resultado = base*altura;

        System.out.println("A área do seu triângulo é de "+resultado+"");

        teclado.close();
    }
}
