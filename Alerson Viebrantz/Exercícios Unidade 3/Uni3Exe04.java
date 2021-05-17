import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero1, numero2, numero3, media, resultado;
        System.out.println("Digite a primeira nota:");
        numero1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        numero2 = teclado.nextFloat();    
        System.out.println("Digite a terceira nota:");
        numero3 = teclado.nextFloat();

        resultado = (numero1*5) + (numero2*3) + (numero3*2);  
        media = resultado / 10;

        System.out.print("Sua média foi de "+media+"");

        teclado.close();
        

    }
}
