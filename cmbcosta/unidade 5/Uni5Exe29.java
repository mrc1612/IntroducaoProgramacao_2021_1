import java.util.Scanner;
public class Uni5Exe29 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char dados = 'S';
        System.out.println("Informe um valor inteiro:");
        int valor = scanner.nextInt();

        while (dados == 'S' || dados == 's'){ 
System.out.println(valor / 20 + " nota(s) de 20");
valor = valor % 20;
System.out.println(valor / 10 + " nota(s) de 10");
valor = valor % 10;
System.out.println(valor / 5 + " nota(s) de 5");
valor = valor % 5;
System.out.println(valor / 2 + " nota(s) de 2");
valor = valor % 2;
System.out.println(valor / 1 + " nota(s) de 1");
valor = valor % 1;

        System.out.println("Deseja colocar outro valor? s (SIM) / n (NÃO)?");
        dados = scanner.next().charAt(0);
    }
    scanner.close();
}}