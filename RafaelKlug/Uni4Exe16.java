import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Entrada
        System.out.println("Informe a idade do primeiro homem:");
        int idadeHomem1 = tec.nextInt();

        System.out.println("Informe a idade do segundo homem:");
        int idadeHomem2 = tec.nextInt();

        System.out.println("Informe a idade da primeira mulher:");
        int idadeMulher1 = tec.nextInt();

        System.out.println("Informe a idade da segunda mulher:");
        int idadeMulher2 = tec.nextInt();

        int somaIdade;
        int produtoIdade;
        boolean caso1, caso2;
        if (idadeHomem1 > idadeHomem2) {
            caso1 = true;
        }
        else {
            caso1 = false;
        }
        if (idadeMulher1 > idadeMulher2) {
            caso2 = true;
        }
        else {
            caso2 = false;
        }

        // Processo
        if (caso1 == true && caso2 == true) {
            somaIdade = (idadeHomem1 + idadeMulher2);
            produtoIdade = (idadeHomem2 * idadeMulher1);
            System.out.println("A soma das idades é: " + somaIdade);
            System.out.println("O produto das idades é: " + produtoIdade);
        }
        if (caso1 == false && caso2 == false) {
            somaIdade = (idadeHomem2 + idadeMulher1);
            produtoIdade = (idadeHomem1 * idadeMulher2);
            System.out.println("A soma das idades é: " + somaIdade);
            System.out.println("O produto das idades é: " + produtoIdade);
        }
        if (caso1 == true && caso2 == false) {
            somaIdade = (idadeHomem1 + idadeMulher2);
            produtoIdade = (idadeHomem2 * idadeMulher1);
            System.out.println("A soma das idades é: " + somaIdade);
            System.out.println("O produto das idades é: " + produtoIdade);
        }
        if (caso1 == false && caso2 == true) {
            somaIdade = (idadeHomem2 + idadeMulher2);
            produtoIdade = (idadeHomem1 * idadeMulher1);
            System.out.println("A soma das idades é: " + somaIdade);
            System.out.println("O produto das idades é: " + produtoIdade);
        }
        else {
            System.out.println("As idades são iguais");
        }
        

        tec.close();

    }
}

// Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
// a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
// soma das idades do homem mais velho com a mulher mais nova, e o produto das
// idades do homem mais novo com a mulher mais velha
