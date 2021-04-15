import java.util.Scanner;

    public class Uni4Ex21 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso, altura, imc;
        System.out.print("Informe o seu peso: ");
        peso = teclado.nextFloat();
        System.out.print("Informe a sua altura: ");
        altura = teclado.nextFloat();
        imc = (peso / (altura * altura));
        if (imc < 18.5) {
            System.out.println("O seu IMC é: " + imc);
            System.out.println("Você está abaixo do peso.");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("O seu IMC é: " + imc);
                System.out.println("Você está no seu peso ideal.");
        } else {
            if (imc >= 25 && imc <= 29.9) {
                System.out.println("O seu IMC é: " + imc); 
                System.out.println("Você está com sobrepeso.");
        } else {
            if (imc >= 30 && imc <= 34.9) {
                System.out.println("O seu IMC é: " + imc);  
                System.out.println("Você está com obesidade grau I.");
        } else {
            if (imc >= 35 && imc <= 39.9) {
                System.out.println("O seu IMC é: " + imc); 
                System.out.println("Você está com obesidade grau II.");
        } else {
            if (imc >= 34) {
                System.out.println("O seu IMC é: " + imc);
                System.out.println("Você está com obesidade grau III.");
}}}}}}}}