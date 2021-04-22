import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double peso, alt, imc;

        System.out.println("Informe seu peso: ");
        peso = teclado.nextDouble();

        System.out.println("Informe sua altura: ");
        alt = teclado.nextDouble();

        imc = peso/(alt*alt);

        if (imc < 18.5) {
            System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Magreza");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Saudável");
        } else {
            if (imc >= 25 && imc <= 29.9) {
                System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Sobrepeso"); 
        } else {
            if (imc >= 30 && imc <= 34.9) {
                System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Obesidade Grau I");  
        } else {
            if (imc >= 35 && imc <= 39.9) {
                System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Obesidade Grau II (severa)"); 
        } else {
            if (imc >= 34) {
                System.out.println("Sua IMC é: "+imc+" e você se encaixa na classificação de: Obesidade Grau III (mórbida)");
}}}}}}

        teclado.close();
    }
}
