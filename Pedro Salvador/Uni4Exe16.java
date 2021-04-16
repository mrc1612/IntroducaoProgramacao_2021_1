import java.util.Scanner;

public class Uni4Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a idade da primeira mulher: ");
        int idadeMulher = teclado.nextInt();
        System.out.print("Informe a idade da segunda mulher: ");
        int idadeMulher2 = teclado.nextInt();
        System.out.print("Informe a idade do primeiro homem: ");
        int idadeHomem = teclado.nextInt();
        System.out.print("Informe a idade do segundo homem: ");
        int idadeHomem2 = teclado.nextInt();
        String somaIdade = "O valor da soma do homem mais velho com a mulher mais nova é de: ";
        String produtoIdade = "O valor do produto do homem mais novo com a mulher mais velha é de: ";
        if(idadeHomem > idadeHomem2 && idadeMulher < idadeMulher2) {
            System.out.println(somaIdade + (idadeHomem + idadeMulher));
            System.out.println(produtoIdade + (idadeHomem2 * idadeMulher2));
        }
        else if(idadeHomem > idadeHomem2 && idadeMulher > idadeMulher2) {
            System.out.println(somaIdade + (idadeHomem + idadeMulher2));
            System.out.println(produtoIdade + (idadeHomem2 * idadeMulher));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher < idadeMulher2) {
            System.out.println(somaIdade + (idadeHomem2 + idadeMulher));
            System.out.println(produtoIdade + (idadeHomem * idadeMulher2));
        }
        else if(idadeHomem < idadeHomem2 && idadeMulher > idadeMulher2) {
            System.out.println(somaIdade + (idadeHomem2 + idadeMulher2));
            System.out.println(produtoIdade + (idadeHomem * idadeMulher));
        }
    }   
}
