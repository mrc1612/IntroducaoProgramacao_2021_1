import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    double altura = 0;
    double soma = 0;
    double media = 0;
    for (int i = 1; i <= 20; i++) {
        System.out.print("Digite a altura da pessoa: ");
        altura = teclado.nextDouble();
        soma = soma + altura;
        media = soma / 20;
    }
    System.out.print("a média é: "+media);
    teclado.close(); 
    }
}

