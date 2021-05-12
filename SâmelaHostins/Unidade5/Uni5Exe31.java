/*Dado um número inteiro positivo, determine a sua decomposição em fatores primos.
 A saída do programa deve ser semelhante ao exemplo abaixo:*/
import java.util.Scanner;
public class Uni5Exe31 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int div = 2;
        System.out.println("Informe um numero positivo:");
        int valor = ler.nextInt();

        while (valor != 1) {
if ( valor % div == 0){
    System.out.println(div);
    valor = valor/ div;
}else{
    div ++;
}}}
        }				 

