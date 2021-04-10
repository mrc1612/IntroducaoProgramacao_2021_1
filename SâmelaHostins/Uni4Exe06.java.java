import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
char d;
System.out.println("Como você se define? Escreva em letra maiuscula, M =  Masculino, F = Feminino ou I = Não Informado.");
d = ler.next().charAt(0);
if (d =='M' ) {
System.out.println("Masculino.");
} else {
if (d == 'F') {
System.out.println("Feminino.");
} else {
if (d == 'I') {
System.out.println("Não Informado.");
} else {
System.out.println("Entrada Incorreta.");
    }
}}}}
