import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner tec =  new Scanner(System.in);

        //Entrada
        int lado1, lado2, lado3;
        lado1 = tec.nextInt();
        lado2 = tec.nextInt();
        lado3 = tec.nextInt();

        //Processo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero!");
        }
        else if (lado1 != lado2 && lado2 != lado3) {
            System.out.println("O triângulo é escaleno!");
        }
        else if (lado1 == lado2 && lado2 != lado3) {
            System.out.println("O triângulo é isósceles");
        }
        else if (lado1 < 0 && lado2 < 0 && lado3 < 0) {
            System.out.println("Os valores informados não formam um triângulo");
        }

        tec.close();
    }
}
