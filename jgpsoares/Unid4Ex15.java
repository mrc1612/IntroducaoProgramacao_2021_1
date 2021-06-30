import java.util.Scanner;

public class Unid4Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Um reajuste será feito no seu salário. Por favor, informe o seu salário atual: ");
        float salario = teclado.nextFloat();
        System.out.print("Informe quantos meses fazem desde que você foi admitido na empresa: ");
        int meses = teclado.nextInt();
        float reajuste;
        if(meses <= 12) {
            System.out.println("O valor do reajuste será de: " + (salario * 0.05));
        }
        else {
            System.out.println("O valor do reajuste será de: " + (salario * 0.07));
        }
    }    
}