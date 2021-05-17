import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a massa:");
        double massa = tec.nextDouble();
        System.out.println("Digite a altura:");
        double altura = tec.nextDouble();

        double imc;
        imc = (massa / altura * altura);

        //Processo
        if (imc > 18.5) {
            System.out.println("Magreza");
        }
        if (imc == 18.5 && imc < 24.9) {
            System.out.println("Saudável");
        }
        if (imc == 25.0 && imc < 29.9) {
            System.out.println("Sobrepeso");
        }
        if (imc == 30.0 && imc < 34) {
            System.out.println("Magreza");
        }
    }
}
