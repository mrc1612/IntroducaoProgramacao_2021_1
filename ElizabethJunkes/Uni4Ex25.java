import java.util.Scanner;

public class Uni4Ex25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha apenas uma das opções abaixo: ");
        System.out.println();
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (denominador deve ser diferente de zero)");
        int numero = s.nextInt();
        System.out.print("Informe os dois números desejados para a realização da operação: ");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        switch(numero) {
            case 1:
                float num3 = num1 + num2;
                System.out.println("A soma é: " + num3);
            break;
            case 2:
                float num4 = num1 - num2;
                System.out.println("A diferença é: " + num4);
            break;
            case 3:
                float num5 = num1 * num2;
                System.out.println("O produto é: " + num5);
            break;
            case 4:
                float num6 = num1 / num2;
                System.out.println("A divisão é: " + num6);
            break;
            default:
                System.out.println("Opção inválida! O número de operação digitado não existe."); 
        }
    }
}